package com.marticus.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.marticus.department.entity.DepartmentEntity;
import com.marticus.department.repo.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	public void saveCustomer(DepartmentEntity departmentEnty) {
		
		departmentRepository.save(departmentEnty);
		
	}

	public DepartmentEntity findDepartmentById(long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findDepartmentById(id);
	}

	public List<DepartmentEntity> findAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	public Boolean deleteDepartmentById(long id) {
		// TODO Auto-generated method stub
		DepartmentEntity depmt = departmentRepository.findDepartmentById(id);
		if(depmt != null)
		{
			departmentRepository.delete(depmt);
			return true;
		}
		return false;
	}

	public void updateDepartment(DepartmentEntity dept) {
		// TODO Auto-generated method stub

		DepartmentEntity dptDB = departmentRepository.findDepartmentById(dept.getId());
		dptDB.setDepartmentCode(dept.getDepartmentCode());
		dptDB.setDepartmentName(dept.getDepartmentName());
		
		departmentRepository.save(dptDB);
	}

}
