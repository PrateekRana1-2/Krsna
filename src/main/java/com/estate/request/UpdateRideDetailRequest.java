package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateRideDetailRequest {
	private Long id;
	private Boolean active = true;
	private String status;
	private String date;
	private String price;
	private String redeemed;
	private Long coustmerId;
	
	private Long driverId;
}
