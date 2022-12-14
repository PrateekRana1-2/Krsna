package com.estate.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.estate.Exception.ResourceNotFoundException;
import com.estate.Repository.DriverInfoRepo;
import com.estate.Repository.DriverStatusRepo;
import com.estate.Repository.DrivingLicenceRepo;
import com.estate.Repository.VehicleDocumentRepo;
import com.estate.Response.DriverInfoResponse;
import com.estate.Response.GetDriverInfoResponse;
import com.estate.Response.GetDriverLicenceResponse;
import com.estate.Response.GetDriverStatusResponse;
import com.estate.Response.GetVehicleDocumentResponse;
import com.estate.entity.DriverInfoEntity;
import com.estate.entity.DriverStatusEntity;
import com.estate.entity.DrivingLicenceEntity;
import com.estate.entity.VechicleDocumentEntity;
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
@Service
@Component
public class DriverServiceImpl implements DriverService {
	@Autowired
	DriverInfoRepo driverInfoRepo;
	@Autowired
	DriverStatusRepo driverStatusRepo;
	@Autowired
	VehicleDocumentRepo vehicleDocumentRepo;
	@Autowired
	DrivingLicenceRepo drivingLicenceRepo;

	@Override
	public DriverInfoResponse addDriverInfo(DriverInfoRequest driverInfoRequest) {
		DriverInfoEntity entity = new DriverInfoEntity();
		entity.setDriverName(driverInfoRequest.getDriverName());
		entity.setCountry(driverInfoRequest.getCountry());
		entity.setPhoneNumber(driverInfoRequest.getPhoneNumber());
		entity.setDateOfBirth(driverInfoRequest.getDateOfBirth());
		entity.setProfilePic(driverInfoRequest.getProfilePic());
		entity.setDrivingLicense(driverInfoRequest.getDrivingLicense());
		entity.setDeviceInfo(driverInfoRequest.getDeviceInfo());
//		entity.setRating(driverInfoRequest.getRating());
		entity.setSubscriptionModel(driverInfoRequest.getSuscribptionModel());
//		entity.setTotalCancelledRides(driverInfoRequest.getTotalCancelledRides());
//		entity.setTotalCompleteRides(driverInfoRequest.getTotalCompleteRides());
//		entity.setTotalDrive(driverInfoRequest.getTotalDrive());
//		entity.setUpdateDate(driverInfoRequest.getUpdateDate());
		entity.setWalletAmount(driverInfoRequest.getWalletAmount());
		driverInfoRepo.save(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public GetDriverInfoResponse getDriverInfo(Long id) {
		DriverInfoEntity entity=driverInfoRepo.findByid(id);
		GetDriverInfoResponse response= new GetDriverInfoResponse();
		if (entity.getId()==id) {
			response.setDriverName(entity.getDriverName());
			response.setCountry(entity.getCountry());
			response.setDateOfBirth(entity.getDateOfBirth());
			response.setDrivingLicense(response.getDrivingLicense());
			response.setDeviceInfo(entity.getDeviceInfo());
			response.setPhoneNumber(entity.getPhoneNumber());
			response.setProfilePic(entity.getProfilePic());
			response.setSuscribptionModel(entity.getSubscriptionModel());
			response.setWalletAmount(entity.getWalletAmount());
			response.setDrivingLicense(entity.getDrivingLicense());
			return response;
		} else {
			throw new ResourceNotFoundException("100", "notFound", "InvalidUser");
		}
			
		}

	@Override
	public DriverInfoResponse updateDriverInfo(UpdateDriverInfoRequest driverInfoRequest) {
		DriverInfoEntity entity = new DriverInfoEntity();
		entity.setId(driverInfoRequest.getId());
		entity.setDriverName(driverInfoRequest.getDriverName());
		entity.setCountry(driverInfoRequest.getCountry());
		entity.setPhoneNumber(driverInfoRequest.getPhoneNumber());
		entity.setDateOfBirth(driverInfoRequest.getDateOfBirth());
		entity.setProfilePic(driverInfoRequest.getProfilePic());
		entity.setDrivingLicense(driverInfoRequest.getDrivingLicense());
		entity.setDeviceInfo(driverInfoRequest.getDeviceInfo());
//		entity.setRating(driverInfoRequest.getRating());
		entity.setSubscriptionModel(driverInfoRequest.getSuscribptionModel());
//		entity.setTotalCancelledRides(driverInfoRequest.getTotalCancelledRides());
//		entity.setTotalCompleteRides(driverInfoRequest.getTotalCompleteRides());
//		entity.setTotalDrive(driverInfoRequest.getTotalDrive());
//		entity.setUpdateDate(driverInfoRequest.getUpdateDate());
		entity.setWalletAmount(driverInfoRequest.getWalletAmount());
		driverInfoRepo.save(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public DriverInfoResponse deleteDriverInfo(DeleteDriverRequest deleteDriverRequest) {
		DriverInfoEntity entity=driverInfoRepo.findByid(deleteDriverRequest.getId());
		entity.getId();
		entity.setActive(deleteDriverRequest.getActive());
		driverInfoRepo.save(entity);
		
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public DriverInfoResponse addDriverStatus(DriverStatusRequest driverStatusRequest) {
		DriverInfoEntity driverInfoEntity=driverInfoRepo.findAllByid(driverStatusRequest.getDriverId());
		driverInfoEntity.getId();
		DriverStatusEntity entity=new DriverStatusEntity();
		entity.setDriverId(driverInfoEntity);
		entity.setAvailableForBooking(driverStatusRequest.getAvailableForBooking());
		entity.setCurrentLocation(driverStatusRequest.getCurrentLocation());
		entity.setFromTo(driverStatusRequest.getFromTo());
		entity.setOneWayTwoWay(driverStatusRequest.getOneWayTwoWay());
		entity.setPermanentLocation(driverStatusRequest.getPermanentLocation());
		
		driverStatusRepo.save(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public DriverInfoResponse updateDriverStatus(UpdateDriverStatusRequest updatedriverStatusRequest) {
		DriverInfoEntity driverInfoEntity=driverInfoRepo.findAllByid(updatedriverStatusRequest.getDriverId());
		driverInfoEntity.getId();
		DriverStatusEntity entity=new DriverStatusEntity();
		entity.setId(updatedriverStatusRequest.getId());
		entity.setDriverId(driverInfoEntity);
		entity.setAvailableForBooking(updatedriverStatusRequest.getAvailableForBooking());
		entity.setCurrentLocation(updatedriverStatusRequest.getCurrentLocation());
		entity.setFromTo(updatedriverStatusRequest.getFromTo());
		entity.setOneWayTwoWay(updatedriverStatusRequest.getOneWayTwoWay());
		entity.setPermanentLocation(updatedriverStatusRequest.getPermanentLocation());
		driverStatusRepo.save(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public GetDriverStatusResponse getDriverStatus(Long id) {
		DriverStatusEntity entity=driverStatusRepo.findByDriverId(id);
		GetDriverStatusResponse response =new GetDriverStatusResponse();
		if (entity.getId()!=id) {
			response.setDriverId(entity.getDriverId().getId());
			response.setAvailableForBooking(entity.getAvailableForBooking());
			response.setCurrentLocation(entity.getCurrentLocation());
			response.setFromTo(entity.getFromTo());
			response.setOneWayTwoWay(entity.getOneWayTwoWay());
			response.setPermanentLocation(entity.getPermanentLocation());
			return response;	
		}else {
			throw new ResourceNotFoundException("100", "notFound", "InvalidUser");
		}	
	}

	@Override
	public DriverInfoResponse addVechicalDocument(VehicalDocumentRequest vehicalDocumentRequest) {
		DriverInfoEntity driverInfoEntity=driverInfoRepo.findAllByid(vehicalDocumentRequest.getDriverId());
		driverInfoEntity.getId();
		VechicleDocumentEntity entity=new VechicleDocumentEntity();
		entity.setDriverId(driverInfoEntity);
		entity.setInsurance(vehicalDocumentRequest.getInsurance());
		entity.setLicenceHolderName(vehicalDocumentRequest.getLicenceHolderName());
		entity.setMaxPericePerKm(vehicalDocumentRequest.getMaxPericePerKm());
		entity.setMinPricePerKm(vehicalDocumentRequest.getMinPericePerKm());
		entity.setRcPhotoBack(vehicalDocumentRequest.getRcPhotoBack());
		entity.setRcPhotoFront(vehicalDocumentRequest.getRcPhotoFront());
		entity.setVehicleModelName(vehicalDocumentRequest.getVehicleModelName());
		entity.setVehicleNumber(vehicalDocumentRequest.getVehicleNumber());
		entity.setVehiclePhoto(vehicalDocumentRequest.getVehiclePhoto());
		vehicleDocumentRepo.save(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public DriverInfoResponse UpdateVechicalDocument(UpdateVehicalDocumentRequest updateVehicalDocumentRequest) {
		DriverInfoEntity driverInfoEntity=driverInfoRepo.findAllByid(updateVehicalDocumentRequest.getDriverId());
		driverInfoEntity.getId();
		VechicleDocumentEntity entity=new VechicleDocumentEntity();
		entity.setId(updateVehicalDocumentRequest.getId());
		entity.setDriverId(driverInfoEntity);
		entity.setInsurance(updateVehicalDocumentRequest.getInsurance());
		entity.setLicenceHolderName(updateVehicalDocumentRequest.getLicenceHolderName());
		entity.setMaxPericePerKm(updateVehicalDocumentRequest.getMaxPericePerKm());
		entity.setMinPricePerKm(updateVehicalDocumentRequest.getMinPericePerKm());
		entity.setRcPhotoBack(updateVehicalDocumentRequest.getRcPhotoBack());
		entity.setRcPhotoFront(updateVehicalDocumentRequest.getRcPhotoFront());
		entity.setVehicleModelName(updateVehicalDocumentRequest.getVehicleModelName());
		entity.setVehicleNumber(updateVehicalDocumentRequest.getVehicleNumber());
		entity.setVehiclePhoto(updateVehicalDocumentRequest.getVehiclePhoto());
		vehicleDocumentRepo.save(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public GetVehicleDocumentResponse getVehicleDocument(Long id) {
		VechicleDocumentEntity entity=vehicleDocumentRepo.findByDriverId(id);
		GetVehicleDocumentResponse response =new GetVehicleDocumentResponse();
		if (entity.getId()!=id) {
			response.setDriverId(entity.getDriverId().getId());
			response.setInsurance(entity.getInsurance());
			response.setInsurance(entity.getInsurance());
			response.setLicenceHolderName(entity.getLicenceHolderName());
			response.setMaxPericePerKm(entity.getMaxPericePerKm());
			response.setMinPericePerKm(entity.getMinPricePerKm());
			response.setRcPhotoFront(entity.getRcPhotoFront());
			response.setRcPhotoBack(entity.getRcPhotoBack());
			response.setVehicleModelName(entity.getVehicleModelName());
			response.setVehicleNumber(entity.getVehicleNumber());
			response.setVehiclePhoto(entity.getVehiclePhoto());
			
			return response ;
		}else {
			throw new ResourceNotFoundException("100", "invalid", "InvalidUser");
		}
	}

	@Override
	public DriverInfoResponse deleteVehicleDocument(DeleteVehicalDocumentRequest deleteDriverRequest) {
		VechicleDocumentEntity entity=vehicleDocumentRepo.findByDriverId(deleteDriverRequest.getId());
		entity.getId();
		entity.setActive(deleteDriverRequest.getActive());
		vehicleDocumentRepo.save(entity);
		
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public DriverInfoResponse addDriverLicence(DriverLicenceRequest driverLicenceRequest) {
		DrivingLicenceEntity entity=new DrivingLicenceEntity();
		entity.setBackPhoto(driverLicenceRequest.getBackPhoto());
		entity.setFrontPhoto(driverLicenceRequest.getFrontPhoto());
		entity.setLicenceNumber(driverLicenceRequest.getLicenceNumber());
		drivingLicenceRepo.save(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public GetDriverLicenceResponse getDriverLicence(Long id) {
		DrivingLicenceEntity entity=drivingLicenceRepo.findByid(id);
		GetDriverLicenceResponse response=new GetDriverLicenceResponse();
		if (entity.getId()==id) {
			response.setBackPhoto(entity.getBackPhoto());
			response.setFrontPhoto(entity.getFrontPhoto());
			response.setLicenceNumber(entity.getLicenceNumber());
			return response;
		}else {
			throw new ResourceNotFoundException("100", "invalid", "InvalidUser");
		}
	}

	@Override
	public DriverInfoResponse updateDriverLicence(UpdateDriverLicenceRequest driverLicenceRequest) {
		DrivingLicenceEntity entity=drivingLicenceRepo.findByid( driverLicenceRequest.getId());
		entity.getId();
		entity.setBackPhoto(driverLicenceRequest.getBackPhoto());
		entity.setFrontPhoto(driverLicenceRequest.getFrontPhoto());
		entity.setLicenceNumber(driverLicenceRequest.getLicenceNumber());
//		entity.setActive( driverLicenceRequest.getActive());
		drivingLicenceRepo.save(entity);
		
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}

	@Override
	public DriverInfoResponse deleteDriverLicence(Long id) {
		DrivingLicenceEntity entity=drivingLicenceRepo.findByid(id);
		entity.getId();
		drivingLicenceRepo.delete(entity);
		DriverInfoResponse response = new DriverInfoResponse();
		response.setDoneSuccessfully(true);
		return response;
	}
	

}
