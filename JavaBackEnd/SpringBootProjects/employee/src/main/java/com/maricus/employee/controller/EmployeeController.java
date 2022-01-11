package com.maricus.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maricus.employee.entity.EmployeeEntity;
import com.maricus.employee.service.EmployeeService;
import com.maricus.employee.vo.EmployeeVO;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public ResponseEntity<List<EmployeeVO>> getAllRestdata() {
		List<EmployeeVO> empList = employeeService.getAllRestData();
		return ResponseEntity.ok(empList);

	}
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById (@PathVariable long id)
	{
		EmployeeEntity emp = employeeService.getEmployeeById(id);
		
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/employee/{empid}")
	public ResponseEntity<List<EmployeeEntity>> getEmployeeByEmployeeId(@PathVariable String empId)
	{
		List<EmployeeEntity> employeeEntity= employeeService.getEmployeeByEmployeeId(empId);
		return ResponseEntity.ok(employeeEntity);
	}
	
}
