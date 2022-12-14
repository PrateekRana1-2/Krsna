package com.estate.service;

import com.estate.Response.AddCoustmerResponse;
import com.estate.Response.GetCoustmerResponse;
import com.estate.Response.GetCoustmerWalletResponse;
import com.estate.request.CoustmerRequest;
import com.estate.request.CoustmerWalletRequest;
import com.estate.request.UpdateCoustmerRequest;

public interface CoustmerSevice {

	AddCoustmerResponse createCoustmer(CoustmerRequest request);

	GetCoustmerResponse getCoustmer(Long id);

	AddCoustmerResponse updateCoustmer(UpdateCoustmerRequest updateCoustmer);

	AddCoustmerResponse deleteCoustmer(Long id);

	AddCoustmerResponse addCoustmerCoustmer(CoustmerWalletRequest coustmerWallet);

	GetCoustmerWalletResponse getCoustmerWallet(Long id);

}
