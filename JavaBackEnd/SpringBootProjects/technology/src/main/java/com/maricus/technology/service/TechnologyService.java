package com.maricus.technology.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.maricus.technology.entity.TechnologyEntity;
import com.maricus.technology.repo.TechnologyRepository;

@Service
public class TechnologyService {
	
	
	@Autowired
	TechnologyRepository technologyRepository;

	public List<TechnologyEntity> getAllTechnologys() {
		// TODO Auto-generated method stub
		return technologyRepository.findAll();
	}

	public TechnologyEntity getTechnologyById(long id) {
		// TODO Auto-generated method stub
		return technologyRepository.findProjectById(id);
	}
	
	

}
