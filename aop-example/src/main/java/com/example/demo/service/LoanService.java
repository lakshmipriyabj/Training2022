package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoanService {
	
public double getInterest(int value) {
	
	System.out.println("value:" +value);
	
	if(value>3000)
	{
		return 5.5;
	}
	else {
	return 4.5;
	}
}
}