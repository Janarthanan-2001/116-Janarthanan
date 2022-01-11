package net.guides.springboot.todomanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.guides.springboot.todomanagement.model.Employee;
import net.guides.springboot.todomanagement.service.EmployeeService;

@Controller
public class EmployeeController {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@RequestMapping(value = "/list-employees", method = RequestMethod.GET)
	public String showEmployees(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("employees", employeeService.getEmployeesByUser(name));
	
		return "list-employees";
	}
 

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/add-employee", method = RequestMethod.GET)
	public String showAddEmployeePage(ModelMap model) {
		
		model.addAttribute("employee", new Employee());
		return "employee";
	}

	@RequestMapping(value = "/delete-employee", method = RequestMethod.GET)
	public String deleteEmployee(@RequestParam long id) {
		employeeService.deleteEmployee(id);
		// service.deleteTodo(id);
		return "redirect:/list-employees";
	}

	@RequestMapping(value = "/update-employee", method = RequestMethod.GET)
	public String showUpdateEmployeePage(@RequestParam long id, ModelMap model) {
		Employee employee  = employeeService.getEmployeeById(id).get();
		model.put("employee", employee);
		return "employee";
	}

	@RequestMapping(value = "/update-employee", method = RequestMethod.POST)
	public String updateEmployee(ModelMap model, @Valid Employee employee, BindingResult result) {

		if (result.hasErrors()) {
			return "employee";
		}

		employee.setEmployeeName(getLoggedInUserName(model));
		employeeService.updateEmployee(employee);
		return "redirect:/list-employees";
	}

	@RequestMapping(value = "/add-employee", method = RequestMethod.POST)
	public String addEmployee(ModelMap model, @Valid Employee employee, BindingResult result) {

		if (result.hasErrors()) {
			return "employee";
		}

		employee.setEmployeeName(getLoggedInUserName(model));
		employeeService.saveEmployee(employee);
		return "redirect:/list-employees";
	}
	

}
