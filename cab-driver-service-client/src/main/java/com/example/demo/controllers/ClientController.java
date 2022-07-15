package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private TripDTO dto;
	
	@GetMapping(path = "/drivers")
	public  String getDrivers() {
		
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
	
	}
	
	
	@GetMapping(path = "/srch/drivers/{name}")
	public  String getDriverByName(@PathVariable("name") String name) {
		
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name,String.class);
	
	}
	@GetMapping(path = "/drivers/json")
	public  CabDriver[] getDriversAsJson() {
		
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers", CabDriver[].class);
	
	}
	
	@GetMapping(path = "/srch/trips/{id}")
	public  String getTrips(@PathVariable("id") int id) {
		
		return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/"+id,String.class);
	
	}
	@GetMapping(path = "/drivers/trips/{id}")
	public  TripDTO getDriverTrips(@PathVariable("id") int id) {
		
		CabDriver driver = this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
		
		TripDetail[] trips = this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/"+id,TripDetail[].class);
		
		//return driver+trips;
		
		//JSON FORMAT
		
		dto.setDriver(driver);
		//List<TripDetail>detailset = Arrays.asList(trips);
		Set<TripDetail>detailset = Arrays.stream(trips).collect(Collectors.toSet());
		dto.setTrips(detailset);
		return dto;
		
	
	}
}
