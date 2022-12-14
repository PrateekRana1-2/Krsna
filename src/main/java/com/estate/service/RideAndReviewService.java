package com.estate.service;

import java.util.List;

import com.estate.Response.GetDriverNotificationResponse;
import com.estate.Response.GetRideForCoustmerrResponse;
import com.estate.Response.GetRideForDriverResponse;
import com.estate.Response.RideDetailResponse;
import com.estate.request.AddReviewRequest;
import com.estate.request.DeleteRideDetailRequest;
import com.estate.request.PostNotificationRequest;
import com.estate.request.RideDetailRequest;
import com.estate.request.UpdateRideDetailRequest;

public interface RideAndReviewService {

	RideDetailResponse bookRideDetails(RideDetailRequest rideDetailRequest);

	RideDetailResponse updateRideDetails(UpdateRideDetailRequest rideDetailRequest);

	RideDetailResponse deleteRideDetails(DeleteRideDetailRequest rideDetailRequest);

	RideDetailResponse addReview(AddReviewRequest reviewRequest);

	GetRideForDriverResponse getRideForDriver(Long id);

	GetRideForCoustmerrResponse getRideForCoustmer(Long id);

	RideDetailResponse postNotification(PostNotificationRequest notificationRequest);

	List<GetDriverNotificationResponse> getDriverNotification(Long id);

	List<GetDriverNotificationResponse> getCoustmerNotification(Long id);

}
