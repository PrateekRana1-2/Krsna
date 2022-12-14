package com.estate.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetRideForCoustmerrResponse {
	private String status;
	private String date;
	private String price;
//	private String redeemed;
	private Long coustmerId;
	private String CoustmerName;
//	private Long driverId;
}
