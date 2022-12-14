package com.estate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estate.entity.ReviewEntity;

public interface ReviewRepo extends JpaRepository<ReviewEntity, Long> {

	
}
