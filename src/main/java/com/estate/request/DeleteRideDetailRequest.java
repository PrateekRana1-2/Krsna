package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteRideDetailRequest {
	private Long id;
	private Boolean active = false;
}
