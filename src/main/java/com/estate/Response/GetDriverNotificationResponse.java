package com.estate.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetDriverNotificationResponse {
	private String DateTime;
	private String message;
	private Long driverId;
	private Long coustmerId;
}
