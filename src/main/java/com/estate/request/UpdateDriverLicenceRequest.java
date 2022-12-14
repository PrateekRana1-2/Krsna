package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDriverLicenceRequest {
	private Long id;
	private String frontPhoto;
	private String backPhoto;
	private String licenceNumber;
}
