package com.estate.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCoustmerWalletResponse {
	private Long coustmerId;
	private String amount;
	private String dateTime;
	private String transaction;
}
