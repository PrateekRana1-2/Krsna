 package com.estate.fcm;


public class FirebaseRequestDataModel<T> {
	private String title;

    private String body;

    private int flag;

    private long id;

    private String icon;

    private T appData;

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

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public T getAppData() {
		return appData;
	}

	public void setAppData(T appData) {
		this.appData = appData;
	}
}
