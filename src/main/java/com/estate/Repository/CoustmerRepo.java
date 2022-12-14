package com.estate.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.estate.entity.CoustmerEntity;


public interface CoustmerRepo extends  JpaRepository<CoustmerEntity, Long> {

	CoustmerEntity findAllByid(Long id);

	Optional<CoustmerEntity> findByPhoneNo(String phoneNo);
//	@Query("select case when count(*) >0 then true else false end from CoustmerEntity as a where a.employeeCode=:empCode")
//	boolean getCodeCount(@Param("empCode")String empCode);
}


