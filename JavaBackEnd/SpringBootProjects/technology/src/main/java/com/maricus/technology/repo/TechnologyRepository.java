package com.maricus.technology.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maricus.technology.entity.TechnologyEntity;

@Repository
public interface TechnologyRepository extends JpaRepository<TechnologyEntity, Long> {

	TechnologyEntity findProjectById(long id);

}
