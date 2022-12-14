package com.estate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estate.entity.CoustmerWalletEntity;


public interface WalletCoustmerRepo  extends JpaRepository<CoustmerWalletEntity, Long>{

	@Query(value ="Select * From coustmer_wallet as u Where u.Coustmer_id=:id",nativeQuery = true )
	CoustmerWalletEntity findByCoustmerId(Long id);
	

	
}
