package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Component
@FieldDefaults(level= AccessLevel.PRIVATE)

public class Invoice {
	Customer customer;
	Product product;
	
	// constructor dependency 
	@Autowired
	public Invoice(@Qualifier("suresh")Customer customer, Product product) {
		super();
		System.out.println("+++++invoice constructor called+++++");
		this.customer = customer;
		this.product = product;
	}

}
