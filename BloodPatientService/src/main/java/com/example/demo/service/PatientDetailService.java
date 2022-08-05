package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PatientDetail;
import com.example.demo.repository.PatientDetailsRepository;

@Service
public class PatientDetailService {
	
	@Autowired
	private PatientDetailsRepository repo;

	public PatientDetailService(PatientDetailsRepository repo) {
		super();
		this.repo = repo;
	}
	
	public PatientDetail save(PatientDetail entity) {
		
		return this.repo.save(entity);
	}
	
	public List<PatientDetail> findAll(){
		
		return this.repo.findAll();
				
	}
	
	public Optional<PatientDetail> findById(int id){
	
		return this.repo.findById(id);
	}
	
	public PatientDetail findByLocation(String loc) {
		
		return this.repo.findByLocation(loc);
	}
	
	public List<PatientDetail> findByBloodGroup(String grp) {
		
		return this.repo.findByBloodGroup(grp);
	}
	
	
	

}
