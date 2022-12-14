package com.estate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estate.request.Note;
//import com.estate.request.PushNotificationRequest;
import com.estate.resource.RestMappingConstant;
//import com.estate.serviceImpl.FirebaseMessagingService;
//import com.estate.serviceImpl.PushNotificationService;
import com.google.firebase.messaging.FirebaseMessagingException;

@RestController
public class PushNotificationController {
//	@Autowired
//	FirebaseMessagingService firebaseService;

//		
//	    private PushNotificationService pushNotificationService;
//	    
//	    public PushNotificationController(PushNotificationService pushNotificationService) {
//	        this.pushNotificationService = pushNotificationService;
//	    }
//	    
//		@PostMapping(path = RestMappingConstant.TaskrequestUri.PUSH_NOTIFICATION)
//	    public ResponseEntity sendTokenNotification(@RequestBody PushNotificationRequest request) {
//	        pushNotificationService.sendPushNotificationToToken(request);
////	        System.out.println("princr");
//	        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
//	    }
//	@PostMapping(path = RestMappingConstant.TaskrequestUri.PUSH_NOTIFICATION)
//	@ResponseBody
//	public String sendNotification(@RequestBody Note note, @RequestParam String token)
//			throws FirebaseMessagingException {
//		return firebaseService.sendNotification(note, token);
//	}

}
