package com.practice.JerseyApp;

public class Message {
	private long id;
	private String message;
	private int year;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Message(long id, String message, int year) {
		super();
		this.id = id;
		this.message = message;
		this.year = year;
	}
	public Message() {
		this.id = 0;
		this.message = "";
		this.year = 0;
	}
	
	
}
