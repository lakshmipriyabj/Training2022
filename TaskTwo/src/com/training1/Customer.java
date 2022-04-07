package com.training1;

public class Customer {

	private String name;
	private String id;
	private int mobile_num;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(int mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String id, int mobile_num, String address) {
		super();
		this.name = name;
		this.id = id;
		this.mobile_num = mobile_num;
		this.address = address;
	}
	
	

	
}
