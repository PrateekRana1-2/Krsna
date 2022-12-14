package com.estate.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCoustmerRequest {
	private Long id;
	private String name;
	private String phoneNo;
	private String wallet;
	private String isLogin;
	private String walletHistory;
}
