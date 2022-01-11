package com.employee.managementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.managementsystem.model.User;
import com.employee.managementsystem.service.EmployeeService;



@Controller
public class AuthController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/login")
	public String login(User user, Model model) {
		boolean isUserPresent = employeeService.authenticateUser(user);
	
		if (isUserPresent) {
			return "redirect:/employee/";
		}
		model.addAttribute("wrongpassword", "Username or Password is wrong");
		return "index";
	}

}
