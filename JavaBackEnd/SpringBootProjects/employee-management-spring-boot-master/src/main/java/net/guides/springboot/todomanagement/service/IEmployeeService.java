package net.guides.springboot.todomanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import net.guides.springboot.todomanagement.model.Employee;
import net.guides.springboot.todomanagement.repository.EmployeeRepo;



public class IEmployeeService implements EmployeeService {

	
	@Autowired
	private EmployeeRepo employeeRepo;

	
	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findEmployeeName(name);
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

	@Override
	public void addEmployee( String name, String empid, String salary, String age, String aadhar,
			String dept) {
		// TODO Auto-generated method stub
		employeeRepo.save(new Employee(name, empid, salary,age,aadhar, dept));
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee = employeeRepo.findById(id);
		if(employee.isPresent())
		{
			employeeRepo.delete(employee.get());
		}
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

	@Override
	public Object getEmployeesByUser(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByUserName(name);
	}

	
	

}
