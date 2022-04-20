package com.training.service;

import com.training.model.InvalidEmailException;

public class Customer {

	
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String customerName, long phoneNumber, String email) { //throws InvalidEmailException {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
//		if(email.contains("@") &&  email.contains(".com") 
//				&& email.contains(".org") && email.contains(".in")) 
//		{
//			System.out.println("valid");
//		}else {
//			throw new InvalidEmailException("error");
//		}
//		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() throws InvalidEmailException
	{
	
		
		if(email.contains("@") &&  email.contains(".com") 
				&& email.contains(".org") && email.contains(".in")) 
		{
			System.out.println("valid");
		}else {
			throw new InvalidEmailException("error");
		}
		
		
		
	}
	
	
	
	
}