package com.estate.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.estate.Repository.CoustmerRepo;
import com.estate.Repository.DriverInfoRepo;
import com.estate.Repository.NotificationRepo;
import com.estate.Repository.ReviewRepo;
import com.estate.Repository.RideDetailsRepo;
import com.estate.Response.GetDriverNotificationResponse;
import com.estate.Response.GetRideForCoustmerrResponse;
import com.estate.Response.GetRideForDriverResponse;
import com.estate.Response.RideDetailResponse;
import com.estate.entity.CoustmerEntity;
import com.estate.entity.DriverInfoEntity;
import com.estate.entity.NotificationEntity;
import com.estate.entity.ReviewEntity;
import com.estate.entity.RideDetailsEntity;
import com.estate.request.AddReviewRequest;
import com.estate.request.DeleteRideDetailRequest;
import com.estate.request.PostNotificationRequest;
import com.estate.request.RideDetailRequest;
import com.estate.request.UpdateRideDetailRequest;
import com.estate.service.RideAndReviewService;

@Service
@Component
public class RideAndReviewServiceImpl implements RideAndReviewService {
	@Autowired
	DriverInfoRepo driverInfoRepo;
	@Autowired
	CoustmerRepo coustmerRepo;
	@Autowired
	RideDetailsRepo rideDetailsRepo;
	@Autowired
	ReviewRepo reviewRepo;
	@Autowired
	NotificationRepo notificationRepo;

	@Override
	public RideDetailResponse bookRideDetails(RideDetailRequest rideDetailRequest) {
		DriverInfoEntity driverInfoEntity = driverInfoRepo.findAllByid(rideDetailRequest.getDriverId());
		driverInfoEntity.getId();
		CoustmerEntity coustmerEntity = coustmerRepo.findAllByid(rideDetailRequest.getCoustmerId());
		coustmerEntity.getId();

		RideDetailsEntity entity = new RideDetailsEntity();
		entity.setDriverId(driverInfoEntity);
		entity.setCoustmerId(coustmerEntity);
		entity.setDate(rideDetailRequest.getDate());
		entity.setPrice(rideDetailRequest.getPrice());
		entity.setRedeemed(rideDetailRequest.getRedeemed());
		entity.setStatus(rideDetailRequest.getStatus());
		rideDetailsRepo.save(entity);
		RideDetailResponse response = new RideDetailResponse();
		response.setDoneSucessfully(true);
		return response;
	}

	@Override
	public RideDetailResponse updateRideDetails(UpdateRideDetailRequest rideDetailRequest) {
		DriverInfoEntity driverInfoEntity = driverInfoRepo.findAllByid(rideDetailRequest.getDriverId());
		driverInfoEntity.getId();
		CoustmerEntity coustmerEntity = coustmerRepo.findAllByid(rideDetailRequest.getCoustmerId());
		coustmerEntity.getId();
		RideDetailsEntity entity = rideDetailsRepo.findByid(rideDetailRequest.getId());
		entity.getId();

		entity.setCoustmerId(coustmerEntity);
		entity.setDriverId(driverInfoEntity);
		entity.setDate(rideDetailRequest.getDate());
		entity.setPrice(rideDetailRequest.getPrice());
		entity.setRedeemed(rideDetailRequest.getRedeemed());
		entity.setStatus(rideDetailRequest.getStatus());
		rideDetailsRepo.save(entity);
		RideDetailResponse response = new RideDetailResponse();
		response.setDoneSucessfully(true);
		return response;
	}

	@Override
	public RideDetailResponse deleteRideDetails(DeleteRideDetailRequest rideDetailRequest) {
		RideDetailsEntity entity = rideDetailsRepo.findByid(rideDetailRequest.getId());
		entity.getId();
		entity.setActive(rideDetailRequest.getActive());
		rideDetailsRepo.save(entity);
		RideDetailResponse response = new RideDetailResponse();
		response.setDoneSucessfully(true);
		return response;
	}

	@Override
	public RideDetailResponse addReview(AddReviewRequest reviewRequest) {
		RideDetailsEntity rideDetailsEntity = rideDetailsRepo.findByid(reviewRequest.getRideDetailId());
		rideDetailsEntity.getId();
		ReviewEntity entity = new ReviewEntity();
		entity.setRating(reviewRequest.getRating());
		entity.setReview(reviewRequest.getReview());
		entity.setRideDetailId(rideDetailsEntity);
		reviewRepo.save(entity);

		RideDetailResponse response = new RideDetailResponse();
		response.setDoneSucessfully(true);
		return response;
	}

	@Override
	public GetRideForDriverResponse getRideForDriver(Long id) {
		DriverInfoEntity driverInfoEntity = driverInfoRepo.findAllByid(id);
		driverInfoEntity.getDriverName();
		RideDetailsEntity entity = rideDetailsRepo.findByDriverId(id);
		GetRideForDriverResponse response = new GetRideForDriverResponse();
		response.setDriverId(entity.getDriverId().getId());
		response.setDriverName(driverInfoEntity.getDriverName());
		response.setDate(entity.getDate());
		response.setPrice(entity.getPrice());
		response.setStatus(entity.getStatus());

		return response;
	}

	@Override
	public GetRideForCoustmerrResponse getRideForCoustmer(Long id) {
		CoustmerEntity coustmerEntity = coustmerRepo.findAllByid(id);
		coustmerEntity.getName();
		RideDetailsEntity entity = rideDetailsRepo.findByCoustmerId(id);
		GetRideForCoustmerrResponse response = new GetRideForCoustmerrResponse();
		response.setCoustmerId(entity.getCoustmerId().getId());
		response.setCoustmerName(coustmerEntity.getName());
		response.setDate(entity.getDate());
		response.setPrice(entity.getPrice());
		response.setStatus(entity.getStatus());
		return response;
	}

	@Override
	public RideDetailResponse postNotification(PostNotificationRequest notificationRequest) {
		DriverInfoEntity driverInfoEntity = driverInfoRepo.findAllByid(notificationRequest.getDriverId());
		driverInfoEntity.getId();
		CoustmerEntity coustmerEntity = coustmerRepo.findAllByid(notificationRequest.getCoustmerId());
		coustmerEntity.getId();
		NotificationEntity entity = new NotificationEntity();
		entity.setCoustmerId(coustmerEntity);
		entity.setDriverId(driverInfoEntity);
		entity.setDateTime(notificationRequest.getDateTime());
		entity.setMessage(notificationRequest.getMessage());
		RideDetailResponse response = new RideDetailResponse();
		notificationRepo.save(entity);
		response.setDoneSucessfully(true);
		return response;

	}

	@Override
	public List<GetDriverNotificationResponse> getDriverNotification(Long id) {
		List<NotificationEntity> entity = notificationRepo.findAllById(id);
		return entity.stream().map(s -> convertToModel1(s)).collect(Collectors.toList());
	}

	public GetDriverNotificationResponse convertToModel1(NotificationEntity entity) {

		GetDriverNotificationResponse response = new GetDriverNotificationResponse();
		response.setCoustmerId(entity.getCoustmerId().getId());
		response.setDriverId(entity.getDriverId().getId());
		response.setDateTime(entity.getDateTime());
		response.setMessage(entity.getMessage());
		return response;
	}

	@Override
	public List<GetDriverNotificationResponse> getCoustmerNotification(Long id) {
		List<NotificationEntity> entity = notificationRepo.findAllByCoustmerId(id);
		return entity.stream().map(s -> convertToModel12(s)).collect(Collectors.toList());
	}

	public GetDriverNotificationResponse convertToModel12(NotificationEntity entity) {

		GetDriverNotificationResponse response = new GetDriverNotificationResponse();
		response.setCoustmerId(entity.getCoustmerId().getId());
		response.setDriverId(entity.getDriverId().getId());
		response.setDateTime(entity.getDateTime());
		response.setMessage(entity.getMessage());
		return response;
	}

}
