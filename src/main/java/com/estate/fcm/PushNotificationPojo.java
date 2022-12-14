package com.estate.fcm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PushNotificationPojo {
	private Integer userId;
	private String userDeviceToken;
	private String deviceType;
	
}

