package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CreditCard;
import com.example.demo.service.CreditCardService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class CreditCardController {
	
	public CreditCardService service;
    
	@Autowired
	public CreditCardController(CreditCardService service) {
		super();
		this.service = service;
	}
	
	
	 @GetMapping(path="/creditcards")
	 public List<CreditCard> findAll(){
		 log.info("find all called");
	    	return this.service.findAll();
	 }
	 
	 @GetMapping(path="/creditcards/{id}")
	  public CreditCard findById(@PathVariable("id") long id)
	  {
		 return this.service.findById(id);
	  }
	 
	 @PostMapping(path="/creditcards")
	 public ResponseEntity<CreditCard> addCard(@RequestBody CreditCard entity) {
		 
		    CreditCard card = this.service.addCard(entity);
	    	return ResponseEntity.status(HttpStatus.CREATED).body(card);
	    }
	 
	 @DeleteMapping(path="/creditcards/delete/{id}")
	 public ResponseEntity<String> remove(@RequestBody CreditCard entity)
	    {
	    	 this.service.remove(entity);
	    	return ResponseEntity.status(HttpStatus.OK).body("One row deleted");
	    }

}
