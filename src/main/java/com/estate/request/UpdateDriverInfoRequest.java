package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDriverInfoRequest {
	private Long id;
	private String driverName;
	private String phoneNumber;
	private String profilePic;
	private String suscribptionModel;
//	private String Rating;
//	private String totalDrive;
	private String walletAmount;
//	private String updateDate;
//	private String totalCompleteRides;
	private String country;
	private String dateOfBirth;
	private String drivingLicense;
	private String deviceInfo;
//	private String totalCancelledRides;
}
