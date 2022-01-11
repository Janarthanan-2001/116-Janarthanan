package com.maricus.employee.vo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class EmployeeVO {
	
	private String empId;
	private String empName;
	private String ProjectName;
	private String technologyName;

}
