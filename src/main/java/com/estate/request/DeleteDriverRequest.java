package com.estate.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteDriverRequest {
	private Long id;
	private Boolean active;
}
