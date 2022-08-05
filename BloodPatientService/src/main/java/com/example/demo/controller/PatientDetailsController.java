package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PatientDetail;
import com.example.demo.service.PatientDetailService;
import com.google.common.base.Optional;

import net.bytebuddy.implementation.bytecode.Throw;

@RestController
@RequestMapping(path="/api/v1/patients")
public class PatientDetailsController {
	
	@Autowired
	private PatientDetailService service;

	public PatientDetailsController(PatientDetailService service) {
		super();
		this.service = service;
	}
	
	
	@PostMapping
    public PatientDetail add(@RequestBody PatientDetail entity) {
		
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<PatientDetail> findAll(){
		
		return this.service.findAll();
	}
	
	
	@GetMapping(path="/{id}")
	public PatientDetail findById(@PathVariable("id") int id){
		
		return this.service.findById(id).orElseThrow(()-> new RuntimeException("Element Not found"));
	}
	
	@GetMapping(path="/loc/{location}")
	public PatientDetail findByLocation(@PathVariable("location") String loc) {
		
		return this.service.findByLocation(loc);
	}
    
	@GetMapping(path="/bg/{bloodgroup}")
	public List<PatientDetail> findByBloodGroup(@PathVariable("bloodgroup") String grp) {
		return this.service.findByBloodGroup(grp);
	}
	
	
	
}
