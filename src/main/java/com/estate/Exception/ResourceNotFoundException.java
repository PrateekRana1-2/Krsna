package com.estate.Exception;

public class ResourceNotFoundException extends AppException {

	public ResourceNotFoundException(String errorType, String errorCode, String message) {
		super(errorType, errorCode, message);
	}

	private static final long serialVersionUID = 1L;

	

	
}
