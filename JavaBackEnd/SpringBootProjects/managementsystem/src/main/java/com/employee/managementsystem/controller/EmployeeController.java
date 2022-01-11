package com.employee.managementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.managementsystem.model.Employee;
import com.employee.managementsystem.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String getEmployeeList(Model model) {
		List<Employee> employees = employeeService.getAllEmployeeList();
		model.addAttribute("empList", employees);

		return "emloyeelist";
	}

	@GetMapping("/add")
	public String addEmployee() {

		return "addEmployees";
	}

	@PostMapping("/add")
	public String saveEmployeeInDb(Employee employee) {
		employeeService.saveEmployeeInDB(employee);

		return "redirect:/employee/";
	}
	
	@GetMapping("/update/{id}")
	public String updateScreen(@PathVariable int id, Model model) {
		Employee emp = employeeService.findEmployeesById(id);
		model.addAttribute("id", emp.getId());
		model.addAttribute("empid", emp.getEmpId());
		model.addAttribute("name", emp.getEmpName());
		model.addAttribute("age", emp.getAge());
		model.addAttribute("salary", emp.getSalary());
		model.addAttribute("department", emp.getDepartment());
		model.addAttribute("aadhar", emp.getAadharNumber());

		return "updateEmp";
	}

	@PostMapping("/update")
	public String updateEmployee(Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:/employee/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employee/";

	}
	
	@GetMapping("/search")
	public String search(Employee employee) {
		return "search";

	}

	@PostMapping("/search")
	public String searchResults(String search, Model model) {
		List<Employee> empList = employeeService.search(search);
		model.addAttribute("empList", empList);
		return "searchResult";
	}
}
