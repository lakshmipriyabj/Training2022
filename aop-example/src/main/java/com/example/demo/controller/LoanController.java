package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoanService;

@RestController
@RequestMapping("/api/v1")
public class LoanController {
	
	private LoanService  service;

	
	@Autowired
	public LoanController(LoanService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(path = "/loans")
	public ResponseEntity<String> getLoanDetails(){
		double val = service.getInterest(7000);
	//	return ResponseEntity<String>.ok.(val+"Per Amount");
		return ResponseEntity.ok(val+"Per Annum");
		
		
	}
	

}
