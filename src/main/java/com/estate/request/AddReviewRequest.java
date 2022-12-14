package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddReviewRequest {
//	private Long id;
	private Long rideDetailId;
	private String rating;
	private String review;

	
}
