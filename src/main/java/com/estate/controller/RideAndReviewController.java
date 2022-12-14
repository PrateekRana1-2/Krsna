package com.estate.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estate.Constant.RestMappingConstant;
import com.estate.Response.BaseApiResponse;
import com.estate.Response.ResponseBuilder;
import com.estate.Response.RideDetailResponse;
import com.estate.request.AddReviewRequest;
import com.estate.request.DeleteRideDetailRequest;
import com.estate.request.PostNotificationRequest;
import com.estate.request.RideDetailRequest;
import com.estate.request.UpdateRideDetailRequest;
import com.estate.service.RideAndReviewService;

@RestController
public class RideAndReviewController {
	
	@Autowired
	RideAndReviewService rideAndReviewService;

	@PostMapping(value = RestMappingConstant.TaskrequestUri.BOOK_RIDE_DETAILS)
	ResponseEntity<BaseApiResponse> bookRide(HttpServletRequest request,
			@RequestBody RideDetailRequest rideDetailRequest){
		RideDetailResponse response =rideAndReviewService.bookRideDetails(rideDetailRequest);
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(response);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
	}
	
	@PostMapping(value = RestMappingConstant.TaskrequestUri.UPDATE_RIDE_DETAILS)
	ResponseEntity<BaseApiResponse> updateRide(HttpServletRequest request,
			@RequestBody UpdateRideDetailRequest rideDetailRequest){
		RideDetailResponse response =rideAndReviewService.updateRideDetails(rideDetailRequest);
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(response);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
	}
	@DeleteMapping(value = RestMappingConstant.TaskrequestUri.DELETE_RIDE_DETAILS)
	ResponseEntity<BaseApiResponse> deleteRide(HttpServletRequest request,
			@RequestBody DeleteRideDetailRequest rideDetailRequest){
		RideDetailResponse response =rideAndReviewService.deleteRideDetails(rideDetailRequest);
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(response);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
	}
	@PostMapping(value = RestMappingConstant.TaskrequestUri.ADD_REVIEW)
	ResponseEntity<BaseApiResponse> addReview(HttpServletRequest request,
			@RequestBody AddReviewRequest reviewRequest){
		RideDetailResponse response =rideAndReviewService.addReview(reviewRequest);
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(response);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
		
	}
	@GetMapping(value = RestMappingConstant.TaskrequestUri.GET_RIDE_FOR_DRIVER)
	ResponseEntity<BaseApiResponse> getRideForDriver(HttpServletRequest request,
			@RequestParam Long id){
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(rideAndReviewService.getRideForDriver(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
	}
	@GetMapping(value = RestMappingConstant.TaskrequestUri.GET_RIDE_FOR_Coustmer)
	ResponseEntity<BaseApiResponse> getRideForCoustmer(HttpServletRequest request,
			@RequestParam Long id){
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(rideAndReviewService.getRideForCoustmer(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
	}
	@PostMapping(value = RestMappingConstant.TaskrequestUri.POST_NOTIFICATION)
	ResponseEntity<BaseApiResponse> postNotification(HttpServletRequest request,
			@RequestBody PostNotificationRequest notificationRequest){
		RideDetailResponse response =rideAndReviewService.postNotification(notificationRequest);
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(response);
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);	
	}
	@GetMapping(value = RestMappingConstant.TaskrequestUri.GET_NOTIFICATION_FOR_DRIVER)
	ResponseEntity<BaseApiResponse> getDriverNotification(HttpServletRequest request,
			@RequestParam Long id){
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(rideAndReviewService.getDriverNotification(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
	}
	@GetMapping(value = RestMappingConstant.TaskrequestUri.GET_NOTIFICATION_FOR_COUSTMER)
	ResponseEntity<BaseApiResponse> getCoustmerNotification(HttpServletRequest request,
			@RequestParam Long id){
		BaseApiResponse baseApiResponse =ResponseBuilder.getSuccessResponse(rideAndReviewService.getCoustmerNotification(id));
		return new ResponseEntity<BaseApiResponse>(baseApiResponse,HttpStatus.OK);
	}
	
}
