package com.estate.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estate.Constant.RestMappingConstant;
import com.estate.Response.BaseApiResponse;
import com.estate.Response.DriverInfoResponse;
import com.estate.Response.ResponseBuilder;
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
import com.estate.service.DriverService;

@RestController
public class DriverController {
	@Autowired
	DriverService driverService;

	@PostMapping(path = RestMappingConstant.TaskrequestUri.ADD_DRIVER_INFO)
	ResponseEntity<BaseApiResponse> addDriver(HttpServletRequest request,
			@RequestBody DriverInfoRequest driverInfoRequest) {
		DriverInfoResponse CoustmerResponse = driverService.addDriverInfo(driverInfoRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	
	@GetMapping(path = RestMappingConstant.TaskrequestUri.GET_DRIVER_INFO)
	ResponseEntity<BaseApiResponse> getDriverInfo(HttpServletRequest request, @RequestParam Long id) {
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(driverService.getDriverInfo(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@PutMapping(path = RestMappingConstant.TaskrequestUri.UPDATE_DRIVER_INFO)
	ResponseEntity<BaseApiResponse> updateDriverInfo(HttpServletRequest request,
			@RequestBody UpdateDriverInfoRequest updatedriverInfoRequest) {
		DriverInfoResponse CoustmerResponse = driverService.updateDriverInfo(updatedriverInfoRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@DeleteMapping(path = RestMappingConstant.TaskrequestUri.DELETE_DRIVER_INFO)
	ResponseEntity<BaseApiResponse> deleteDriverInfo(HttpServletRequest request,
			@RequestBody DeleteDriverRequest deleteDriverRequest) {
		BaseApiResponse baseApiResponse = ResponseBuilder
				.getSuccessResponse(driverService.deleteDriverInfo(deleteDriverRequest));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@PostMapping(path = RestMappingConstant.TaskrequestUri.ADD_DRIVER_STATUS)
	ResponseEntity<BaseApiResponse> addDriverStatus(HttpServletRequest request,
			@RequestBody DriverStatusRequest driverStatusRequest) {
		DriverInfoResponse CoustmerResponse = driverService.addDriverStatus(driverStatusRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@PutMapping(path = RestMappingConstant.TaskrequestUri.UPDATE_DRIVER_STATUS)
	ResponseEntity<BaseApiResponse> updateDriverStatus(HttpServletRequest request,
			@RequestBody UpdateDriverStatusRequest updatedriverStatusRequest) {
		DriverInfoResponse CoustmerResponse = driverService.updateDriverStatus(updatedriverStatusRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@GetMapping(path = RestMappingConstant.TaskrequestUri.GET_DRIVER_STATUS)
	ResponseEntity<BaseApiResponse> getDriverStatus(HttpServletRequest request, @RequestParam Long id) {
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(driverService.getDriverStatus(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@PostMapping(value = RestMappingConstant.TaskrequestUri.ADD_VEHICLE_DOCUMENT)
	ResponseEntity<BaseApiResponse> addVehicalDocument(HttpServletRequest request,
			@RequestBody VehicalDocumentRequest vehicalDocumentRequest) {
		DriverInfoResponse CoustmerResponse = driverService.addVechicalDocument(vehicalDocumentRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@PutMapping(value = RestMappingConstant.TaskrequestUri.UPDATE_VEHICLE_DOCUMENT)
	ResponseEntity<BaseApiResponse> updateVehicalDocument(HttpServletRequest request,
			@RequestBody UpdateVehicalDocumentRequest vehicalDocumentRequest) {
		DriverInfoResponse CoustmerResponse = driverService.UpdateVechicalDocument(vehicalDocumentRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}

	@GetMapping(path = RestMappingConstant.TaskrequestUri.GET_VEHICLE_DOCUMENT)
	ResponseEntity<BaseApiResponse> getVehicleDocument(HttpServletRequest request, @RequestParam Long id) {
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(driverService.getVehicleDocument(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}
	
	@DeleteMapping(path = RestMappingConstant.TaskrequestUri.DELETE_VEHICAL_DOCUMENT)
	ResponseEntity<BaseApiResponse> deleteVehicleDocument(HttpServletRequest request,
			@RequestBody DeleteVehicalDocumentRequest deleteDriverRequest) {
		BaseApiResponse baseApiResponse = ResponseBuilder
				.getSuccessResponse(driverService.deleteVehicleDocument(deleteDriverRequest));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}
	@PostMapping(value = RestMappingConstant.TaskrequestUri.ADD_DRIVER_LICENCE)
	ResponseEntity<BaseApiResponse> addDriverLicence(HttpServletRequest request,
			@RequestBody DriverLicenceRequest driverLicenceRequest) {
		DriverInfoResponse CoustmerResponse = driverService.addDriverLicence(driverLicenceRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}
	@GetMapping(path = RestMappingConstant.TaskrequestUri.GET_DRIVER_LICENCE)
	ResponseEntity<BaseApiResponse> getDriverLicence(HttpServletRequest request, @RequestParam Long id) {
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(driverService.getDriverLicence(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}
	@PutMapping(value = RestMappingConstant.TaskrequestUri.UPDATE_DRIVER_LICENCE)
	ResponseEntity<BaseApiResponse> updateDriverLicence(HttpServletRequest request,
			@RequestBody UpdateDriverLicenceRequest driverLicenceRequest) {
		DriverInfoResponse CoustmerResponse = driverService.updateDriverLicence(driverLicenceRequest);
		BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(CoustmerResponse);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}
	@DeleteMapping(path = RestMappingConstant.TaskrequestUri.DELETE_DRIVER_LICENCE)
	ResponseEntity<BaseApiResponse> deleteDriverLicence(HttpServletRequest request,
			@RequestParam Long id) {
		BaseApiResponse baseApiResponse = ResponseBuilder
				.getSuccessResponse(driverService.deleteDriverLicence(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
	}
	
}
