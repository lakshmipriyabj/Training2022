package com.training3;

public class Hotel {
	
	private String name;
	private String serviceProvider;
	private int room;
	private String cusion;
	private int rating;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String name, String serviceProvider, int room, String cusion, int rating) {
		super();
		this.name = name;
		this.serviceProvider = serviceProvider;
		this.room = room;
		this.cusion = cusion;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getCusion() {
		return cusion;
	}
	public void setCusion(String cusion) {
		this.cusion = cusion;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	

}
