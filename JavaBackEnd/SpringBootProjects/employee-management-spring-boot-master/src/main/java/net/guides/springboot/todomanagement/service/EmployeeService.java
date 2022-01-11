package net.guides.springboot.todomanagement.service;


import java.util.List;
import java.util.Optional;

import net.guides.springboot.todomanagement.model.Employee;


public interface EmployeeService {
	

	

	Optional<Employee> getEmployeeById(long id);

	void updateEmployee(Employee employee);

	void addEmployee( String name,String empid, String salary, String age, String aadhar, String dept);

	void deleteEmployee(long id);
	
	void saveEmployee(Employee employee);

	List<Employee> getEmployeeByName(String name);

	Object getEmployeesByUser(String name);


}
