package com.estate.resource;

public interface RestMappingConstant {
 String APP_BASE="/myApp/v1";
  
 public interface TaskrequestUri{
	 
	 String AUTHANTICATION = APP_BASE+"/authantication";
	 
	 String ADD_COUSTMER= APP_BASE +"/addUser";
	 String GET_COUSTMER= APP_BASE +"/getuser";
	String UPDATE_COUSTMER = APP_BASE+"/updateuser";
	String DELETE_COUSTMER = APP_BASE+"/deleteuser";
	String UPDATE_WALLET = APP_BASE+"/updatewallet";
	String GET_COUSTMER_WALLET = APP_BASE+"/getcoustmerwallet";
	String ADD_DRIVER_INFO = APP_BASE+"/adddriverinfo";
	String GET_DRIVER_INFO = APP_BASE+"/getdriverinfo";
	String UPDATE_DRIVER_INFO =APP_BASE+"/updatedriverinfo";
	String DELETE_DRIVER_INFO =APP_BASE+"/deletedriverinfo";
	String ADD_DRIVER_STATUS = APP_BASE+"/adddriverstatus";
	String UPDATE_DRIVER_STATUS = APP_BASE+"/updatedriverstatus";
	String GET_DRIVER_STATUS = APP_BASE+"/getdriverstatus";
	String ADD_VEHICLE_DOCUMENT = APP_BASE+"/addvehicledocument";
	String UPDATE_VEHICLE_DOCUMENT = APP_BASE+"/updatevehicledocument";
	String GET_VEHICLE_DOCUMENT = APP_BASE+"/getvehicledocument";
	String DELETE_VEHICAL_DOCUMENT =APP_BASE+"/deletevehicaldocument";
	String ADD_DRIVER_LICENCE = APP_BASE+"/adddriverlicence";
	String GET_DRIVER_LICENCE = APP_BASE+"/getdriverlicence";
	String UPDATE_DRIVER_LICENCE = APP_BASE+"/updatedriverlicence";
	String DELETE_DRIVER_LICENCE = APP_BASE+"/deletedrivinglicence";
	String BOOK_RIDE_DETAILS = APP_BASE+"/bookrideDetails";
	String UPDATE_RIDE_DETAILS =  APP_BASE+"/updaterideDetails";
	String DELETE_RIDE_DETAILS =APP_BASE+"/deleterideDetails";
	String ADD_REVIEW = APP_BASE+"/addreview";
	String GET_RIDE_FOR_DRIVER = APP_BASE+"/getRideForDriver";
	String GET_RIDE_FOR_Coustmer = APP_BASE+"/getRideForcoustmer";
	String POST_NOTIFICATION = APP_BASE+"/postNotification";
	String GET_NOTIFICATION_FOR_DRIVER = APP_BASE+"/getNotificationForDriver";
	String GET_NOTIFICATION_FOR_COUSTMER = APP_BASE+"/getNotificationForCoustmer";

	String PUSH_NOTIFICATION = APP_BASE+"/getNotification";
	

	 
 }
}