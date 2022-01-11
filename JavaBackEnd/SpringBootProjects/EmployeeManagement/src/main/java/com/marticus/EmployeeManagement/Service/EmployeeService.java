package com.marticus.EmployeeManagement.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.EmployeeManagement.Entity.Employee;
import com.marticus.EmployeeManagement.Repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(long id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(long id, Employee employee) {
        Employee updatedEmployee = employeeRepository.findById(id).orElse(null);
        updatedEmployee.setEmployeeId(employee.getEmployeeId());
        updatedEmployee.setEmployeeName(employee.getEmployeeName());
        updatedEmployee.setSalary(employee.getSalary());
        updatedEmployee.setAge(employee.getAge());
        updatedEmployee.setAadhar(employee.getAadhar());
        updatedEmployee.setDepartment(employee.getDepartment());
        return employeeRepository.save(updatedEmployee);
    }

    public void deleteById(long id) {
        employeeRepository.deleteById(id);
    }

}
