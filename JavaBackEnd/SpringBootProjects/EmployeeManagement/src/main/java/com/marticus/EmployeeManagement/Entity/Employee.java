package com.marticus.EmployeeManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class Employee  {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	long id;
	
	@Column(name="Emp_Id")
	String employeeId;
	
	@Column(name="Emp_Name")
	String employeeName;
	
	@Column(name="Salary")
	int salary;
	
	@Column(name="Age")
	int age;
	
	@Column(name="Aadhar")
	long aadhar;
	
	@Column(name="Department")
	String department;
	
}