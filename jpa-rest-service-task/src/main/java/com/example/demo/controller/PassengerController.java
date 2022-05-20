package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.service.PassengerService;

@RestController
@RequestMapping(path="/api/v1")
public class PassengerController {

	PassengerService service;

	
    @Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}
	
    @GetMapping(value = "/passengers")
    public List<Passenger> findAll()
	{
		return service.findAll();
	}
	   
    @GetMapping(value="/passengers/name/{passengerName}")
        public List<Passenger> findByPassengerName(@PathVariable("passengerName")String srchname){
		
		return service.findByPassengerName(srchname);
	}
    
    @GetMapping(value="/passengers/date/{date}")
    public List<Passenger> findBytripHistoryListTripDateTime(@PathVariable("date") @DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime date){
		
		return service.findBytripHistoryListTripDateTime(date);
	}
	
}

