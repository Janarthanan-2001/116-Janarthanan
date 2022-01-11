package com.maricus.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maricus.employee.entity.EmployeeEntity;
import com.maricus.employee.repo.EmployeeRepository;
import com.maricus.employee.vo.EmployeeVO;
import com.maricus.employee.vo.ProjectVO;
import com.maricus.employee.vo.TechnologyVO;

@Service
public class EmployeeService {
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	ProjectVO projectVO;

	@Autowired
	TechnologyVO technologyVO;
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<EmployeeEntity> getAll() {
		
		return employeeRepository.findAll();
	}
	
	public String getRestDataForSingleOne(int id) {
		EmployeeEntity employee = employeeRepository.findEmployeeById(id);
		String projectUrl= "http://PROJ-SERVICE/project/"+employee.getProjectId();
		projectVO = template.getForObject(projectUrl, ProjectVO.class);
		if(projectVO != null)
		{
			String techUrl =  "http://TECH-SERVICE/technology/"+projectVO.getTechnologyId();
			technologyVO = template.getForObject(techUrl, TechnologyVO.class);
		}
		String response = employee.getEmpId()+" | "+employee.getEmpName()+ " | "+projectVO.getProjectName()+" | "+technologyVO.getTechnologyName();
		return response;
		
	}
	
	
	public List<EmployeeVO> getAllRestData() {
		
		List<EmployeeEntity> emplist = employeeRepository.findAll();
		List<EmployeeVO> empdata = new ArrayList<EmployeeVO>();
		for(EmployeeEntity employee : emplist)
		{
			EmployeeVO emp = new EmployeeVO();
			emp.setEmpId(employee.getEmpId());
			emp.setEmpName(employee.getEmpName());
			
			String projectUrl = "http://PROJ-SERVICE/project/" + employee.getProjectId();
			projectVO =template.getForObject(projectUrl, ProjectVO.class);
			if(projectVO != null)
			{
				String techUrl = "http://TECH-SERVICE/technology/" + projectVO.getTechnologyId();
				technologyVO =template.getForObject(techUrl, TechnologyVO.class);
				emp.setProjectName(projectVO.getProjectName());
				if(null != technologyVO)
				{
					emp.setTechnologyName(technologyVO.getTechnologyName());
				}
			}
			empdata.add(emp);
		}
		return empdata;
	}

	public EmployeeEntity getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeeById(id);
	}
	
	
	public List<EmployeeEntity> getEmployeeByEmployeeId(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeeByEmpId(empId);
	}

//	public List<com.maricus.employee.controller.EmployeeVO> getAllRestData() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<com.maricus.employee.controller.EmployeeVO> getAllRestData() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
