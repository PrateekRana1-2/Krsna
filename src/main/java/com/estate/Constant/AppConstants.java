package com.estate.Constant;

public interface AppConstants {
	
	
	public interface statusCode{
		int SUCCESS=0;
		int FAILURE=1;
		int SESSION_EXPIRE=2;
	}
		
	
		interface ErrorType{

			String INVALID_TOKEN_ERROR_TYPE = "Invalid Token ";
			String ENTITY_NOT_EXISTS_ERROR = "Entity Not Exists";
			String USER_NOT_REGISTER="User not Register";
			
		}
			
			interface StatusCodes{
				int SUCCESS = 0;
				int FAILURE = 1;
			}
			
			interface Commons{

				String BLANK_STRING_VALUE = "";
				String ID = "Id";
				String App_URI="/myApp/v1/";
				String MYAPP = "9";
				
			}



			interface ErrorCodes {

				String INVALID_TOKEN_ERROR_CODE = "104";
				String ENTITY_NOT_EXISTS_ERROR_CODE = "102";
				String INVALID_EMAIL="103";
				
				
			}

			interface ErrorMessage {

				String INVALID_TOKEN_ERROR_MESSAGE = "Invalid  Security Token - Authorization";
				String ENTITY_NOT_EXISTS_ERROR_MESSAGE = "Entity Not Exists";
				String USER_DOES_NOT_EXIST = "Account does not Exist";
				String ID_TOKEN_MISMATCH = "Google id token mismatched ";
				String USER_NOT_VERIFIED="User not verified";
				String USER_NOT_REGISTER="User not Registered with application";
				
			}

			interface AppSecurity {

				String APP_SECURITY_TOKEN_NOT_PROVIDED = "App Security Token not provided.";
				String TIME_STAMP_NOT_PROVIDED = "Timestamp not provided.";
				String APP_SECURITY_TOKEN_DIDNOT_MATCH = "App Security Token Did NOT match.";
				String TIMESTAMP = "timestamp";
				
			}

			interface Common {

				String BLANK_STRING_VALUE = "";
				
			}

		}

	

