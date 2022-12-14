package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateVehicalDocumentRequest {
	private Long id;
	private Long driverId;
	private String vehicleNumber;
	private String rcPhotoFront;
	private String rcPhotoBack;
	private String insurance;
	private String vehicleModelName;
	private String licenceHolderName;
	private String vehiclePhoto;
	private String minPericePerKm;
	private String maxPericePerKm;
}
