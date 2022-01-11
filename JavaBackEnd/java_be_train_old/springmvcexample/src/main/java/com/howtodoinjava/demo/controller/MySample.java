package com.howtodoinjava.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.configuration.PropertyFileConfiguration;
import com.howtodoinjava.demo.model.EmployeeVO;
import com.howtodoinjava.demo.service.EmployeeManager;

@Controller
@RequestMapping("/test")
public class MySample {
	@Autowired
	EmployeeManager employeeManager ;
	
	@Autowired
	PropertyFileConfiguration propertyFileConfiguration;

	@RequestMapping(value = "/testhello", method = RequestMethod.GET)
	public String sayHello(Model model)
	{
		model.addAttribute("NAME","JANA" );
		model.addAttribute("SIR_NAME","JAYANTA Sir");
		
		return "test";
	
	}
}
