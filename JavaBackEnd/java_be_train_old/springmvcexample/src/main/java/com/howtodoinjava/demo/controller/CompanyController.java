package com.howtodoinjava.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.model.Company;
import com.howtodoinjava.demo.service.CompanyManager;


@Controller
@RequestMapping("/Comp")
public class CompanyController {
	
	@Autowired
	CompanyManager companyManager;
	
//	@RequestMapping(value = "/getAllCompanyNames", method = RequestMethod.GET)
//	public String getAllCompanyName(Model model)
//	{
//		List<CompanyVo> compList=companyManager.getAllCompanyNames();
//		model.addAttribute("companies",compList );
//		model.addAttribute("name","Jana");
//		model.addAttribute("title","student");
//		model.addAttribute("Sir","JAYANTA Sir");
//		model.addAttribute("Sir_name","Sir");
//		return "companylist";
//	}

	
	@RequestMapping(value = "/getAllCompanies", method = RequestMethod.GET)
	public ModelAndView getAllCompanyNames()
	{
		//System.out.println(propertyFileConfiguration.getTestProperty());
		  return new ModelAndView("Comlist", "company", new Company());
		
		//return "studentreg";
	}
	
	
//	@RequestMapping(value = "/getAllCompanies1", method = RequestMethod.GET)
//	public String getAllCompany_new(Model m)
//	{
//		//System.out.println(propertyFileConfiguration.getTestProperty());
//		//  return new ModelAndView("studentreg", "student", new Student());
//		
//		m.addAttribute("Comlist",new Company());
//		
//		return "Comlist";
//	}
//	 
//	@RequestMapping(value = "/showerror", method = RequestMethod.GET)
//	public String showerror(Model m)
//	{
//		//System.out.println(propertyFileConfiguration.getTestProperty());
//		//  return new ModelAndView("studentreg", "student", new Student());
//		
//		m.addAttribute("Comlist",new Company());
//		
//		return "Comlist";
//	}
//
//	@RequestMapping(value = "/showdashboard", method = RequestMethod.GET)
//	public String showDashBoard(Model m)
//	{
//		
//		m.addAttribute("Comlist",new Company());
//		
//		return "Comlist";
//	}
	
	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	   public String addCompany(@ModelAttribute("company")Company company, 
	   ModelMap model) {
	      model.addAttribute("name", company.getCompanyName());
	      model.addAttribute("id", company.getId());
	      
	      
	      return "Comrslt";
	   }
	
}
	


