package com.maricus.employee.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maricus.employee.entity.EmployeeEntity;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	EmployeeEntity findEmployeeById(long id);

	List<EmployeeEntity> findEmployeeByEmpId(String empId);

}
