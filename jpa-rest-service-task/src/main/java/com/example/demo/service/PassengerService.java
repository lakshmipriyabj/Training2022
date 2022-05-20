package com.example.demo.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.entity.ifaces.PassengerRepository;

@Service
public class PassengerService {
	
	
	

	PassengerRepository repo;
    
	@Autowired
	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Passenger add(Passenger entity) {
		
		return this.repo.save(entity);
	}
	
	public List<Passenger> findAll()
	{
		return repo.findAll();
	}
	
	
	public List<Passenger> findByPassengerName(String srchname){
		
		return repo.findByPassangerName(srchname);
	}
	
	
	public List<Passenger> findBytripHistoryListTripDateTime(LocalDateTime date){
		
		return repo.findByTripHistoryListTripDateTime(date);
	}
	
	
	

}
