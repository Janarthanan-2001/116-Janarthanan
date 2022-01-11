package com.maricus.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maricus.project.entity.ProjectEntity;


@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

	ProjectEntity findProjectById(long id);

	

}
