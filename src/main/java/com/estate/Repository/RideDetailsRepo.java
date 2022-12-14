package com.estate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estate.entity.RideDetailsEntity;

public interface RideDetailsRepo extends JpaRepository<RideDetailsEntity, Long> {

	RideDetailsEntity findByid(Long id);

	@Query(value = "SELECT * FROM rides_details as u WHERE u.driver_id=:id", nativeQuery = true)
	RideDetailsEntity findByDriverId(Long id);

	@Query(value = "SELECT * FROM rides_details as u WHERE u.coustmer_id=:id", nativeQuery = true)
	
	RideDetailsEntity findByCoustmerId(Long id);

}
