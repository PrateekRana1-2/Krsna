package com.estate.Response;

import com.estate.Exception.AppException;
import com.estate.resource.AppConstant;

public class ResponseBuilder {

public static BaseApiResponse getSuccessResponse(Object responseData) throws AppException {
		
		BaseApiResponse baseApiResponse = new BaseApiResponse();
		baseApiResponse.setResponseStatus(new ResponseStatus(AppConstant.StatusCodes.SUCCESS));
		baseApiResponse.setResponseData(responseData);
		baseApiResponse.setMessage("Success");
		
		return baseApiResponse;
	}
	
	public static BaseApiResponse getSuccessResponse() throws AppException {
		
		BaseApiResponse baseApiResponse = new BaseApiResponse();
		baseApiResponse.setResponseStatus(new ResponseStatus(AppConstant.StatusCodes.SUCCESS));
		baseApiResponse.setMessage("Success");
		baseApiResponse.setResponseData(null);
		
		return baseApiResponse;
	}
	
}
