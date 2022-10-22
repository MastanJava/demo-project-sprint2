package com.sprint2.microservices.CitizenService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint2.microservices.CitizenService.Entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>{
	
	public List<Citizen> findByVaccinationCenterId(Integer id);

}
