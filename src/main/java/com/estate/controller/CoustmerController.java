package com.estate.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estate.Response.AddCoustmerResponse;
import com.estate.Response.BaseApiResponse;
import com.estate.Response.ResponseBuilder;
import com.estate.request.CoustmerRequest;
import com.estate.request.CoustmerWalletRequest;
import com.estate.request.UpdateCoustmerRequest;
import com.estate.resource.RestMappingConstant;
import com.estate.service.CoustmerSevice;


@RestController
public class CoustmerController {
	@Autowired
	private CoustmerSevice coustmerSevice;

	@PostMapping(path = RestMappingConstant.TaskrequestUri.ADD_COUSTMER)
	ResponseEntity<BaseApiResponse> newCostmer(HttpServletRequest request,
			@RequestBody CoustmerRequest coustmerRequest) {
		AddCoustmerResponse CoustmerResponse = coustmerSevice.createCoustmer(coustmerRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);

		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	
	@GetMapping(path = RestMappingConstant.TaskrequestUri.GET_COUSTMER)
	ResponseEntity<BaseApiResponse> getCoustmer(HttpServletRequest request, @RequestParam Long id) {
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(coustmerSevice.getCoustmer(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);

	}

	@PutMapping(path = RestMappingConstant.TaskrequestUri.UPDATE_COUSTMER)
	ResponseEntity<BaseApiResponse> updateCoustmer(HttpServletRequest request,
			@RequestBody UpdateCoustmerRequest updateCoustmer) {
		AddCoustmerResponse CoustmerResponse = coustmerSevice.updateCoustmer(updateCoustmer);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@DeleteMapping(path = RestMappingConstant.TaskrequestUri.DELETE_COUSTMER)
	ResponseEntity<BaseApiResponse> deleteCoustmer(HttpServletRequest request, @RequestParam Long id) {
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(coustmerSevice.deleteCoustmer(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@PostMapping(path = RestMappingConstant.TaskrequestUri.UPDATE_WALLET)
	ResponseEntity<BaseApiResponse> addCoustmerWallet(HttpServletRequest request,
			@RequestBody CoustmerWalletRequest coustmerWallet) {
		AddCoustmerResponse CoustmerWalletResponse = coustmerSevice.addCoustmerCoustmer(coustmerWallet);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerWalletResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}
	@GetMapping(path = RestMappingConstant.TaskrequestUri.GET_COUSTMER_WALLET)
	ResponseEntity<BaseApiResponse> getCoustmerWallet(HttpServletRequest request,
			@RequestParam Long id){
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(coustmerSevice.getCoustmerWallet(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
		
	}
}