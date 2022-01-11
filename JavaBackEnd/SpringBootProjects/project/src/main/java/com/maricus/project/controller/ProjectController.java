package com.maricus.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maricus.project.entity.ProjectEntity;
import com.maricus.project.service.ProjectService;



@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("/")
	public  ResponseEntity<List<ProjectEntity>> getProjects() {
		
		List<ProjectEntity> pro = projectService.getAllProjects();
		
		return ResponseEntity.ok(pro);
		
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProjectEntity> getProjectById (@PathVariable long id)
	{
		ProjectEntity pro = projectService.getProjectById(id);
		
		return ResponseEntity.ok(pro);
	}
	
	

}
