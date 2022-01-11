package com.marticus.EmployeeManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marticus.EmployeeManagement.Entity.Employee;
import com.marticus.EmployeeManagement.Service.EmployeeService;

@Controller
@RequestMapping(path="/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/read-employee")
    public String showReadEmployeePage(Model model, Employee employee) {
        model.addAttribute("employees", employeeService.findAll());
        return "read-employee";
    }

    @GetMapping("/create-employee")
    public String showCreateEmployeePage(Model model) {
        model.addAttribute("command", new Employee());
        return "createemployee";
    }

    @PostMapping(value = "/create-employee")
    public String createEmployee(Employee employee,Model model) {
        Employee emp=employeeService.saveEmployee(employee);
        model.addAttribute(employee);        
        return  "employeedetails";
    }

    @GetMapping(value = "/update-employee/{id}")
    public String showUpdateEmployeePage(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", employeeService.findById(id));
        return "update-employee";
    }

    @PutMapping(value = "/update-employee/{id}")
    public String updateEmployee(@PathVariable long id, @ModelAttribute("employee") Employee employee) {
        employeeService.updateEmployee(id, employee);
        return "redirect:/read-employee";
    }

    @DeleteMapping(value = "/delete-employee/{id}")
    public String deleteEmployee(@PathVariable long id) {
        employeeService.deleteById(id);
        return "redirect:/read-employee";
    }

}