 package com.estate.fcm;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;

public class PushNotificationResponse {

	private String multicastId;

	private int numOfSuccessNotification;

	private int numOfFailureNotification;

	private int httpStatusCode;

	List<HashMap<String, String>> results;

	private Instant sentDate;

	public String getMulticastId() {
		return multicastId;
	}

	
	@JsonProperty("multicast_id")
	public void setMulticastId(String multicastId) {
		this.multicastId = multicastId;
	}

	public int getNumOfSuccessNotification() {
		return numOfSuccessNotification;
	}

	@JsonProperty("success")
	public void setNumOfSuccessNotification(int numOfSuccessNotification) {
		this.numOfSuccessNotification = numOfSuccessNotification;
	}

	public int getNumOfFailureNotification() {
		return numOfFailureNotification;
	}

	@JsonProperty("failure")
	public void setNumOfFailureNotification(int numOfFailureNotification) {
		this.numOfFailureNotification = numOfFailureNotification;
	}

	public List<HashMap<String, String>> getResults() {
		return results;
	}

	public void setResults(List<HashMap<String, String>> results) {
		this.results = results;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}


	public Instant getSentDate() {
		return sentDate;
	}

	public void setSentDate(Instant sentDate) {
		this.sentDate = sentDate;
	}
}
