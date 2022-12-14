package com.estate.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetDriverStatusResponse {
	private Long driverId;
	private String currentLocation;
	private String availableForBooking;
	private String oneWayTwoWay;
	private String fromTo;
	private String permanentLocation;
}
