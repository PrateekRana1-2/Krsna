package com.estate.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetDriverLicenceResponse {
	private String frontPhoto;
	private String backPhoto;
	private String licenceNumber;
}
