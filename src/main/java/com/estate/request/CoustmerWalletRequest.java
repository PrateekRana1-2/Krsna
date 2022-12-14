package com.estate.request;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CoustmerWalletRequest {
	private Long id;
	
	private Long coustmerId;
	private String amount;
	private String dateTime;
	private String transaction;
}
