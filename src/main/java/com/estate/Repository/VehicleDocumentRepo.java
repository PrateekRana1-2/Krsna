package com.estate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estate.entity.VechicleDocumentEntity;

public interface VehicleDocumentRepo extends JpaRepository<VechicleDocumentEntity, Long> {

//	@Query(value = "Select * From vehical_document as u Where u.driver_id=:id",nativeQuery = true)
//	VechicleDocumentEntity findByid(Long id);
	@Query(value = "SELECT * FROM vechical_document as u WHERE u.driver_id=:id",nativeQuery = true)
	VechicleDocumentEntity findByDriverId(Long id);

	
}
