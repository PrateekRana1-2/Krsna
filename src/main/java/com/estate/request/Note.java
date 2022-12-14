package com.estate.request;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
public class Note {
	private  String title;
	private	String content;
	private	String rideId;
//    private String token;
}