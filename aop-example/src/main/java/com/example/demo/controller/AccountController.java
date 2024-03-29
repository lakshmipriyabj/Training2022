package com.example.demo.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AccountService;


@RestController
@RequestMapping("/api/v1")
public class AccountController {
	
	private AccountService service;
	
	Logger logger = Logger.getAnonymousLogger();
     
	@Autowired
	public AccountController(AccountService service) {
		super();
	//	logger.info("Account Controller constrtuctor called");
		this.service = service;
	}
	
  
	
	@GetMapping(path="/accounts")
	public List<String> getAccount(){
		
	//	logger.info("GET Acccount method called");
		
		return this.service.getAccounts();
	}
}
