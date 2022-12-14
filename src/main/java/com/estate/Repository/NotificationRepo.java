package com.estate.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estate.entity.NotificationEntity;

public interface NotificationRepo extends JpaRepository<NotificationEntity, Long> {

	@Query(value = "SELECT * FROM notification_table as u WHERE u.coustmer_id=:id",nativeQuery = true)
	List<NotificationEntity> findAllByCoustmerId(Long id);
	@Query(value = "SELECT * FROM notification_table as u WHERE u.driver_id=:id",nativeQuery = true)
	List<NotificationEntity> findAllById(Long id);

	
}
