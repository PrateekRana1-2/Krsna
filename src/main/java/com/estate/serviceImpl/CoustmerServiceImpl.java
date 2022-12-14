package com.estate.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.estate.Exception.ResourceNotFoundException;
import com.estate.Repository.CoustmerRepo;
import com.estate.Repository.WalletCoustmerRepo;
import com.estate.Response.AddCoustmerResponse;
import com.estate.Response.GetCoustmerResponse;
import com.estate.Response.GetCoustmerWalletResponse;
import com.estate.entity.CoustmerEntity;
import com.estate.entity.CoustmerWalletEntity;
import com.estate.request.CoustmerRequest;
import com.estate.request.CoustmerWalletRequest;
import com.estate.request.UpdateCoustmerRequest;
import com.estate.service.CoustmerSevice;

@Service
@Component
public class CoustmerServiceImpl implements CoustmerSevice {
	@Autowired
	CoustmerRepo coustmerRepo;
	@Autowired
	WalletCoustmerRepo walletCoustmerRepo;
	@Autowired
	 PasswordEncoder  passwordEncoder; 

	@Override
	public AddCoustmerResponse createCoustmer(CoustmerRequest request) {
		CoustmerEntity entity = new CoustmerEntity();
		entity.setName           (request.getName());
		entity.setPhoneNo        (request.getPhoneNo());
		entity.setWallet         (request.getWallet());
		entity.setWalletHistory  (request.getWalletHistory());
		entity.setIsLogin        (request.getIsLogin());
		coustmerRepo.save        (entity);

		AddCoustmerResponse response = new AddCoustmerResponse();
		response.setDoneSuccessful(true);

		return response;
	}

	@Override
	public GetCoustmerResponse getCoustmer(Long id) {
		CoustmerEntity entity = coustmerRepo.findAllByid(id);
		GetCoustmerResponse response = new GetCoustmerResponse();
		if (entity.getId() == id) {
			response.setName(entity.getName());
			response.setPhoneNo(entity.getPhoneNo());
			response.setWallet(entity.getWallet());
			response.setWalletHistory(entity.getWalletHistory());
			return response;
		} else {
			throw new ResourceNotFoundException("100", "notFound", "InvalidUser");
		}
	}

	@Override
	public AddCoustmerResponse updateCoustmer(UpdateCoustmerRequest updateCoustmer) {
		CoustmerEntity entity = new CoustmerEntity();
		entity.setId(updateCoustmer.getId());
		entity.setName(updateCoustmer.getName());
		entity.setPhoneNo(updateCoustmer.getPhoneNo());
		entity.setWallet(updateCoustmer.getWallet());
		entity.setWalletHistory(updateCoustmer.getWalletHistory());
		entity.setIsLogin(updateCoustmer.getIsLogin());
		coustmerRepo.save(entity);

		AddCoustmerResponse response = new AddCoustmerResponse();
		response.setDoneSuccessful(true);

		return response;
	}

	@Override
	public AddCoustmerResponse deleteCoustmer(Long id) {
		CoustmerEntity entity = coustmerRepo.findAllByid(id);
		entity.getId();
		coustmerRepo.delete(entity);
		AddCoustmerResponse response = new AddCoustmerResponse();
		response.setDoneSuccessful(true);

		return response;
	}

	@Override
	public AddCoustmerResponse addCoustmerCoustmer(CoustmerWalletRequest coustmerWalletRequest) {
		CoustmerEntity coustmerEntity = coustmerRepo.findAllByid(coustmerWalletRequest.getCoustmerId());
		coustmerEntity.getId();
		CoustmerWalletEntity entity = new CoustmerWalletEntity();
		entity.setAmount(coustmerWalletRequest.getAmount());
		entity.setDateTime(coustmerWalletRequest.getDateTime());
		entity.setTransaction(coustmerWalletRequest.getTransaction());
		entity.setCoustmerId(coustmerEntity);
		walletCoustmerRepo.save(entity);
		AddCoustmerResponse response = new AddCoustmerResponse();
		response.setDoneSuccessful(true);

		return response;
	}

	@Override
	public GetCoustmerWalletResponse getCoustmerWallet(Long id) {
		CoustmerWalletEntity entity = walletCoustmerRepo.findByCoustmerId(id);
		GetCoustmerWalletResponse response = new GetCoustmerWalletResponse();
		if (entity.getId() != id) {
			response.setCoustmerId(entity.getCoustmerId().getId());
			response.setAmount(entity.getAmount());
			response.setDateTime(entity.getDateTime());
			response.setTransaction(entity.getDateTime());
			return response;
		} else {
			throw new ResourceNotFoundException("100", "notFound", "InvalidUser");
		}
	}

	
	}

		


