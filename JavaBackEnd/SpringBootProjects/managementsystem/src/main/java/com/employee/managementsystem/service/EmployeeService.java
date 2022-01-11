package com.employee.managementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.managementsystem.model.Employee;
import com.employee.managementsystem.model.User;
import com.employee.managementsystem.repo.EmployeeRepository;
import com.employee.managementsystem.repo.UserRepository;




@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public List<Employee> getAllEmployeeList() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	public void saveEmployeeInDB(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	public Employee findEmployeesById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeesById(id);
	}

	public void updateEmployee(Employee employee) {
		Employee emp = employeeRepository.findEmployeesById(employee.getId());
		if(emp!=null)
		{
			emp.setEmpId(employee.getEmpId());
			emp.setEmpName(employee.getEmpName());
			emp.setAge(employee.getAge());
			emp.setSalary(employee.getSalary());
			emp.setDepartment(employee.getDepartment());
			emp.setAadharNumber(employee.getAadharNumber());
			employeeRepository.save(emp);
		}
	}
	
	public void deleteEmployee(int id) {
		Employee employee = employeeRepository.findEmployeesById(id);
		if (employee != null) {

			employeeRepository.delete(employee);
		}
	}


	public List<Employee> search(String search) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeesByEmpNameContaining(search);
	}

	public String createUser(User user) {
		String response = " user created successfully";
		User result = userRepository.save(user);
		if (result == null) {
			response = "User cannot be created ";
			return response;
		}
		return response;
	}

	public String update(User user) {
		String response = "User updated Successfully";
		User user1 = userRepository.findUsersById(user.getId());
		if (user1 != null) {
			userRepository.save(user);
			return response;
		}
		response = "No user found";
		return response;
	}

	public String deleteUser(int id) {
		String response = "User deleted Successfully";
		User user = userRepository.findUsersById(id);
		if (user != null) {
			userRepository.deleteById(user.getId());
			return response;
		}
		response = "User Not Found";
		return response;
	}

	public String findAll() {
		String temp;
		String response = "";
		List<User> users = userRepository.findAll();
		if (users.size() > 0) {
			for (User user : users) {
				temp = " Id : " + user.getId() + " Name : " + user.getUserName() + " ";
				response = response + temp;
			}
			return response;
		}
		response = "There are no users";
		return response;

	}

	public String findUsersById(int id) {
		String response;
		User user = userRepository.findUsersById(id);
		if (user != null) {
			response = " Id : " + user.getId() + " Name : " + user.getUserName();
			return response;
		}
		response = "User Not Found";
		return response;
	}

	public String findUsersByUserName(String userName) {
		String response;
		User user = userRepository.findUsersByUserName(userName);
		if (user != null) {
			response = " Id : " + user.getId() + " Name : " + user.getUserName();
			return response;
		}
		response = "User Not Found";
		return response;
	}

	public boolean authenticateUser(User user) {
		User user1 = userRepository.findUsersByUserNameAndPassword(user.getUserName(), user.getPassword());
		if (user1 != null) {
			return true;
		}
		return false;
	}

	
}
