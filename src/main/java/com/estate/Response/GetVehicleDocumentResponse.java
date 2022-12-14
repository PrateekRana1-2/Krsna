package com.estate.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GetVehicleDocumentResponse {

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

