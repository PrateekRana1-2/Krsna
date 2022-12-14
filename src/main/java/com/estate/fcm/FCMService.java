 package com.estate.fcm;


import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;



import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FCMService {

    @Value("${estate.fcm.api.send.url}")
    private String url;
//	private static final String url="https://fcm.googleapis.com/fcm/send";

    
    @Value("${estate.fcm.authorization-key}")
    private String authorizationKey;
//	private static final String authorizationKey="key=AAAA4izz10I:APA91bGpe-QvbU2llv8Rionlob7MG0RhiKtaoCxfP6UloUBwUMyI_fMFGJVarmqzAVfqyE4EpMtWg-kSdW0BwDDWHhKMPKpA-clfi6XUqys1t3P66vS-P4--SHgYffW2AVJg98bZrrKy";

//	@Autowired
//	private MasterDao masterDao;
//	
//	@Autowired
//	private UserDeviceDao  userDeviceDao;

    private final Logger logger = LogManager.getLogger(this.getClass());
//	private boolean checkTime (int checkHour,String timeZone) {
//		DateTimeZone zone = DateTimeZone.forID( "America/Montreal");
//		DateTime now = DateTime.now( zone );
//		Integer hour = now.getHourOfDay();
//		return checkHour==hour;
//	}
	
	public PushNotificationResponse sendNotification(List<PushNotificationPojo> tokens, HashMap<String, String> appData,
			String title, String content, int flag){
		
		FirebaseRequestDataModel<HashMap<String, String>> requestModel=new FirebaseRequestDataModel<>();
        requestModel.setBody(content);
        requestModel.setAppData(appData);
        requestModel.setFlag(flag);
        requestModel.setId(new Date().getTime());
//        requestModel.setIcon(AppConstants.PushNotificationConstant.WORD_OF_DAY_ICON_URL);
        requestModel.setTitle(title);
        List<String> androidTokens=tokens.stream()
				.filter(pojo -> pojo.getDeviceType().equals(
						"Android")/* &&checkTime(hour,pojo.getDeviceTimeZone()) */)
        		.map(PushNotificationPojo::getUserDeviceToken)
        		.collect(Collectors.toList());
 
        FirebaseRequestWrapper<HashMap<String, String>> requestWrapper = new FirebaseRequestWrapper<>();
        requestWrapper.setData(requestModel);
        requestWrapper.setRegistrationIds(androidTokens);
        PushNotificationResponse notificationResponse=null;
        
        if (androidTokens!=null&&!androidTokens.isEmpty()) 
        	notificationResponse=sendRequestToFCM(requestWrapper);
        
        if (notificationResponse!=null) {
        	logger.info("For Android multicastId="+notificationResponse.getMulticastId()
        		+", HttpStatusCode="+notificationResponse.getHttpStatusCode()
        		+", Number of Success Notification="+ notificationResponse.getNumOfSuccessNotification()
        		+" and Number of Failure Notification="+ notificationResponse.getNumOfFailureNotification());
		}
        FirebaseRequestWrapperForIos<HashMap<String, String>> requestWrapperForIos = new FirebaseRequestWrapperForIos<>();
        FirebaseRequestNotificationModel notificatinModel=new FirebaseRequestNotificationModel();
        notificatinModel.setPriority("high");
        notificatinModel.setBody(requestModel.getBody());
        notificatinModel.setTitle(requestModel.getTitle());
        notificatinModel.setSound("default");
        requestWrapperForIos.setData(requestModel);
        requestWrapperForIos.setNotification(notificatinModel);
//        requestWrapperForIos.setRegistrationIds(iosTokens);
//        PushNotificationResponse notificationResponseofios=null;
//        if(iosTokens!=null&!iosTokens.isEmpty())		
        	notificationResponse=sendRequestToFCM(requestWrapperForIos);
//        if (notificationResponse!=null&&iosTokens!=null&!iosTokens.isEmpty()) {
    	   logger.info("For iOS multicastId="+notificationResponse.getMulticastId()
       			+", HttpStatusCode="+notificationResponse.getHttpStatusCode()
       			+", Number of Success Notification="+ notificationResponse.getNumOfSuccessNotification()
       			+" and Number of Failure Notification="+ notificationResponse.getNumOfFailureNotification());
		return notificationResponse;
       }
//        return notificationResponse;
//	}
	
	
	@SuppressWarnings("unchecked")
	private synchronized PushNotificationResponse sendRequestToFCM(Object requestBody) {
		ResponseEntity<PushNotificationResponse> sendNotificationResponseEntity = null;
		PushNotificationResponse notificationResponse=null;
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authorizationKey);
        headers.setContentType(MediaType.APPLICATION_JSON);
        FirebaseRequestWrapper<HashMap<String, String>> requestWrapper = null;
        FirebaseRequestWrapperForIos<HashMap<String, String>> requestWrapperForIos = null;
        try {
        	URI uri = new URI(url);
        	if (requestBody instanceof FirebaseRequestWrapper) {
                requestWrapper = (FirebaseRequestWrapper<HashMap<String, String>>) requestBody;
                HttpEntity<FirebaseRequestWrapper<HashMap<String, String>>> request = new
                        HttpEntity<FirebaseRequestWrapper<HashMap<String, String>>>(requestWrapper, headers);
                sendNotificationResponseEntity = restTemplate.postForEntity(uri, request, PushNotificationResponse.class);
            } else {
                requestWrapperForIos = (FirebaseRequestWrapperForIos<HashMap<String, String>>) requestBody;
                HttpEntity<FirebaseRequestWrapperForIos<HashMap<String, String>>> request = new
                        HttpEntity<FirebaseRequestWrapperForIos<HashMap<String, String>>>(requestWrapperForIos, headers);
                String json1 = new ObjectMapper().writeValueAsString(requestWrapperForIos);
                System.out.println(json1);
                sendNotificationResponseEntity = restTemplate.postForEntity(uri, request, PushNotificationResponse.class);
            }
        	notificationResponse = sendNotificationResponseEntity.getBody();
        	notificationResponse.setSentDate(Instant.now());
        	notificationResponse.setHttpStatusCode(sendNotificationResponseEntity.getStatusCodeValue());
        	
        } catch (HttpClientErrorException e) {
            logger.error("Http Error in fcm response " + e.getMessage());
        } catch (URISyntaxException e) {
            logger.error("Syntax Error in fcm response " + e.getMessage());
        } catch (Exception e) {
            logger.error("Unknown error in Fcm Service Impl: " + e.getMessage());
        }
        return notificationResponse;
	}


}
