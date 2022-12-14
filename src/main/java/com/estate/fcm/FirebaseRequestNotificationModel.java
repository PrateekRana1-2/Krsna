 package com.estate.fcm;

public class FirebaseRequestNotificationModel {
	
	private String title;

    private String body;

    private String priority;
    
    private String sound;
    
    public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPriority() {
		return priority;
	}

	public FirebaseRequestNotificationModel() {
    }

    public FirebaseRequestNotificationModel(String title, String body, String priority) {
        this.title = title;
        this.body = body;
        this.priority = priority;
    }

	@Override
	public String toString() {
        return "FirebaseRequestNotificationModel{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }

	public void setPriority(String string) {
		// TODO Auto-generated method stub
		
	}
    
    

}
