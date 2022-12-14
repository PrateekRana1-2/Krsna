package com.estate.service;

import com.estate.Response.DriverInfoResponse;
import com.estate.Response.GetDriverInfoResponse;
import com.estate.Response.GetDriverLicenceResponse;
import com.estate.Response.GetDriverStatusResponse;
import com.estate.Response.GetVehicleDocumentResponse;
import com.estate.request.DeleteDriverRequest;
import com.estate.request.DeleteVehicalDocumentRequest;
import com.estate.request.DriverInfoRequest;
import com.estate.request.DriverLicenceRequest;
import com.estate.request.DriverStatusRequest;
import com.estate.request.UpdateDriverInfoRequest;
import com.estate.request.UpdateDriverLicenceRequest;
import com.estate.request.UpdateDriverStatusRequest;
import com.estate.request.UpdateVehicalDocumentRequest;
import com.estate.request.VehicalDocumentRequest;

public interface DriverService {

	DriverInfoResponse addDriverInfo(DriverInfoRequest driverInfoRequest);

	GetDriverInfoResponse getDriverInfo(Long id);

	DriverInfoResponse updateDriverInfo(UpdateDriverInfoRequest updatedriverInfoRequest);

	DriverInfoResponse deleteDriverInfo(DeleteDriverRequest deleteDriverRequest);

	DriverInfoResponse addDriverStatus(DriverStatusRequest driverStatusRequest);

	DriverInfoResponse updateDriverStatus(UpdateDriverStatusRequest updatedriverStatusRequest);

	GetDriverStatusResponse getDriverStatus(Long id);

	DriverInfoResponse addVechicalDocument(VehicalDocumentRequest vehicalDocumentRequest);

	DriverInfoResponse UpdateVechicalDocument(UpdateVehicalDocumentRequest vehicalDocumentRequest);

	GetVehicleDocumentResponse getVehicleDocument(Long id);

	DriverInfoResponse deleteVehicleDocument(DeleteVehicalDocumentRequest deleteDriverRequest);

	DriverInfoResponse addDriverLicence(DriverLicenceRequest driverLicenceRequest);

	GetDriverLicenceResponse getDriverLicence(Long id);

	DriverInfoResponse updateDriverLicence(UpdateDriverLicenceRequest driverLicenceRequest);

	DriverInfoResponse deleteDriverLicence(Long id);

}
