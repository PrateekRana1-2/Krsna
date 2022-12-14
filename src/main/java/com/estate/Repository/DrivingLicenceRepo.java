package com.estate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estate.entity.DrivingLicenceEntity;

public interface DrivingLicenceRepo extends JpaRepository<DrivingLicenceEntity, Long> {

	
	DrivingLicenceEntity findByid(Long id);
}
