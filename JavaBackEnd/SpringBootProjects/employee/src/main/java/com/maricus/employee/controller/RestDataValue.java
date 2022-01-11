//package com.maricus.employee.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.maricus.employee.service.EmployeeService;
//
//@Controller
//@RequestMapping("/mvc-controller")
//public class RestDataValue {
//	
//	@Autowired
//	EmployeeService employeeService;
//	
//	@GetMapping("/")
//	public String getAll(Model model)
//	{
//
//		List<EmployeeVO> responseList = employeeService.getAllRestData();
//		model.addAttribute("list", responseList);
//		return "getEmpList.jsp";
//	}
//	
//	
//}
