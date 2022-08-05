package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DonarDetail;
import com.example.demo.entity.repository.DonarDetailRepository;




@Service
public class DonarDetailservice {
	
	public DonarDetailRepository repo;
 
	@Autowired
	public DonarDetailservice(DonarDetailRepository repo) {
		super();
		this.repo = repo;
	}
	
	public DonarDetail add(DonarDetail entity) {
		
		return this.repo.save(entity);
	}
	
	public List<DonarDetail> findAll() {
		
		return this.repo.findAll();
		
	}

	public Optional<DonarDetail> findById(int id){
		
		return this.repo.findById(id);
	}
	
	
	public void  remove(int id) {
		
		Optional<DonarDetail> foundElement =repo.findById(id);
		
		if(foundElement.isPresent()){
			repo.deleteById(id);
		}
		else {
			throw new RuntimeException("Element" +id +"not found");
		}
	}
	
	
	public DonarDetail saveOrUpdate(DonarDetail entity) {
		  return this.repo.save(entity);
	  }
	public List<DonarDetail> findByBloodGroup(String grp){
		return this.repo.findByBloodGroup(grp);
	}

	public List<DonarDetail> findByLocation(String loc){
		
		return this.repo.findByLocation(loc);
		
	}
	
	
	
}
