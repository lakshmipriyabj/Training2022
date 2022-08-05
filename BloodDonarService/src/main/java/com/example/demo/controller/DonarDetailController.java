package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DonarDetail;
import com.example.demo.service.DonarDetailservice;

import lombok.experimental.Delegate;

@RestController
@RequestMapping(path="api/v1/donars")
public class DonarDetailController {
	
	public DonarDetailservice service;
 
	@Autowired
	public DonarDetailController(DonarDetailservice service) {
		super();
		this.service = service;
	}
	
	@PostMapping()
    public DonarDetail add(@RequestBody DonarDetail entity) {
		
		return this.service.add(entity);
	}
	
	@GetMapping()
	public List<DonarDetail> findAll() {
		
		return this.service.findAll();
		
	}

	@GetMapping(path="/srch/{id}")
	public DonarDetail findById(@PathVariable("id") int id){
		
		return this.service.findById(id).orElseThrow(()-> new RuntimeException ("Element Not Found"));
	}
	
	@DeleteMapping(path="/delete/srch/{id}")
	public void remove(@PathVariable("id")int id) {
		 this.service.remove(id);
	}
	
	
	@PutMapping(path = "/update")
	public DonarDetail saveOrUpdate(@RequestBody DonarDetail entity) {
		
		return this.service.saveOrUpdate(entity);
	}
	@GetMapping(path="/bg/{bloodgroup}")
	public List<DonarDetail> findByBloodGroup(@PathVariable("bloodgroup")String grp){
		
		return this.service.findByBloodGroup(grp);
	}
	
	@GetMapping(path="loc/{location}")
	public List<DonarDetail> findByLocation(@PathVariable("location")String loc){
		
		return this.service.findByLocation(loc);
	}
	
	
	
	

}
