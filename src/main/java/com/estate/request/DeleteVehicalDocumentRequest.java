package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteVehicalDocumentRequest {
	private Long id;
	private Boolean active;
}
