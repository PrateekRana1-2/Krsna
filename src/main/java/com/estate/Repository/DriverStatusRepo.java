package com.estate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estate.entity.DriverStatusEntity;

public interface DriverStatusRepo extends JpaRepository<DriverStatusEntity, Long>{

	@Query(value = "Select * From status_driver as u Where u.driver_id=:id",nativeQuery = true)
	DriverStatusEntity findByDriverId(Long id);

	
}
