package com.estate.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetRideForDriverResponse {
	private String status;
	private String date;
	private String price;
//	private String redeemed;
//	private Long coustmerId;
	private String driverName;
	private Long driverId;
}
