package com.estate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estate.entity.DriverInfoEntity;

public interface DriverInfoRepo extends JpaRepository<DriverInfoEntity, Long> {
	@Query(value = "Select *From driver_info as u where u.id=:id", nativeQuery = true)
	DriverInfoEntity findByid(Long id);

	DriverInfoEntity findAllByid(Long Id);

	
//	DriverInfoEntity findAllByid(DriverInfoEntity driverId);

}
