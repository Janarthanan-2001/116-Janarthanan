package net.guides.springboot.todomanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userName;

	



	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String employeeId;
	
	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String employeeName;

	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String salary;
	
	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String age;
	
	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String aadhar;
	
	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String department;
	
	public Employee()
	{
		super();
	}
	
	public Employee( String name,String empid, String salary, String age, String aadhar, String dept)
	{
		super();
		this.employeeId = empid;
		this.employeeName = name;
		this.salary = salary;
		this.age = age;
		this.aadhar = aadhar;
		this.department = dept;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String loggedInUserName) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
