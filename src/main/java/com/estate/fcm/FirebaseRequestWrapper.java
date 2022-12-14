 package com.estate.fcm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirebaseRequestWrapper<T> {
	private List<String> registrationIds;
	private FirebaseRequestDataModel<T> data;
	
	public FirebaseRequestWrapper() {
	}

	public FirebaseRequestWrapper(List<String> registrationIds, FirebaseRequestDataModel<T> data) {
		this.registrationIds = registrationIds;
		this.data = data;
	}

	@JsonProperty("data")
	public FirebaseRequestDataModel<T> getData() {
		return data;
	}

	
	public void setData(FirebaseRequestDataModel<T> data) {
		this.data = data;
	}

	@JsonProperty("registration_ids")
	public List<String> getRegistrationIds() {
		return registrationIds;
	}

	public void setRegistrationIds(List<String> registrationIds) {
		this.registrationIds = registrationIds;
	}

	@Override
	public String toString() {
		return "FirebaseRequestWrapper{" +
				"registrationIds=" + registrationIds +
				", data=" + data +
				'}';
	}
}
