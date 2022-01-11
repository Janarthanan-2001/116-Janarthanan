package com.maricus.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.maricus.project.entity.ProjectEntity;
import com.maricus.project.repo.ProjectRepository;

@Service
public class ProjectService {

	
	@Autowired
	ProjectRepository projectRepository;
	
	public List<ProjectEntity> getAllProjects() {
		
		return projectRepository.findAll();
	}

	public ProjectEntity getProjectById(long id) {
		// TODO Auto-generated method stub
		return projectRepository.findProjectById(id);
	}

	
}
