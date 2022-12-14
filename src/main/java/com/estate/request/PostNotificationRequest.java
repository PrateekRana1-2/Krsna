package com.estate.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostNotificationRequest {
//	private Long id;
	private String DateTime;
	private String message;
	private Long driverId;
	private Long coustmerId;
}
