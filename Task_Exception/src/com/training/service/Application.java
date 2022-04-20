package com.training.service;

import com.training.model.InvalidEmailException;

public class Application {

	public static void main(String[] args) {
		
		Customer obj = new Customer(123,"priya",99987766,"pra.com.org.in");
		try {
			obj.setEmail();
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			System.out.println("invalid");
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub

	}

}
