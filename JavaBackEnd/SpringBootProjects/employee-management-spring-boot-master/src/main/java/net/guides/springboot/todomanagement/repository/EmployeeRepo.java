package net.guides.springboot.todomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot.todomanagement.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	List<Employee> findEmployeeName(String name);

	Object findByUserName(String name);

}
