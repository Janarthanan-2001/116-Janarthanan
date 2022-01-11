package com.employee.managementsystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.managementsystem.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findEmployeesById(int id);

	List<Employee> findEmployeesByEmpNameContaining(String search);

	

}
