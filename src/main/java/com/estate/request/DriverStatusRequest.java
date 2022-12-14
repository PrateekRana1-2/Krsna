package com.estate.request;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class DriverStatusRequest {

//	private Long id;
	private Long driverId;
	private String currentLocation;
	private String availableForBooking;
	private String oneWayTwoWay;
	private String fromTo;
	private String permanentLocation;
}
