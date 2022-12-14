 package com.estate.fcm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirebaseRequestWrapperForIos<T> {
	private FirebaseRequestDataModel<T> data;

    private List<String> registrationIds;

    private FirebaseRequestNotificationModel notification;
    
    public FirebaseRequestWrapperForIos() {
    }

    public FirebaseRequestWrapperForIos(FirebaseRequestDataModel<T> data, List<String> registrationIds,
                                        FirebaseRequestNotificationModel notification) {
        this.data = data;
        this.registrationIds = registrationIds;
        this.notification = notification;
    }

    
    @JsonProperty(value = "notification")
	public FirebaseRequestNotificationModel getNotification() {
		return notification;
	}

	public void setNotification(FirebaseRequestNotificationModel notification) {
		this.notification = notification;
	}

	@JsonProperty(value = "data")
    public FirebaseRequestDataModel<T> getData() {
        return data;
    }

    public void setData(FirebaseRequestDataModel<T> data) {
        this.data = data;
    }

    @JsonProperty(value = "registration_ids")
    public List<String> getRegistrationIds() {
        return registrationIds;
    }

    public void setRegistrationIds(List<String> registrationIds) {
        this.registrationIds = registrationIds;
    }

    @Override
    public String toString() {
        return "FirebaseRequestWrapperForIos{" +
                "data=" + data +
                ", registrationIds=" + registrationIds +
                ", notification=" + notification +
                '}';
    }
}
