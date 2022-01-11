package com.maricus.technology.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.maricus.technology.entity.TechnologyEntity;
import com.maricus.technology.service.TechnologyService;

@RestController
@RequestMapping("/technology")
public class TechnologyController {
	
	@Autowired
	TechnologyService technologyService;
	
	
	@GetMapping("/")
	public  ResponseEntity<List<TechnologyEntity>> getTechnologys() {
		
		List<TechnologyEntity> tech = technologyService.getAllTechnologys();
		return ResponseEntity.ok(tech);
		
	}

	@GetMapping("/{id}")
	public ResponseEntity<TechnologyEntity> getTechnologyById (@PathVariable long id)
	{
		TechnologyEntity tech = technologyService.getTechnologyById(id);
		
		return ResponseEntity.ok(tech);
	}

}
