package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;

@Service
public class DriverService {
	
	
	private DriverRepository repo;
    
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		
		return this.repo.findAll();
	}

	public Driver add(Driver entity) {
		
		return this.repo.save(entity);
	}
	
public Driver findById(int id) {
		
		return this.repo.findById(id).orElseThrow(() -> new RuntimeException(id + "Not Found"));
}
//public Optional<Driver> removeById(Driver entity)
//{
//	 Optional<Driver> optional =Optional.empty();
//	 if(this.repo.existsById(entity.getDriverId())) {
//
//		 this.repo.delete(entity);
//
//		 optional = Optional.of(entity);
//		 }
//	return optional; }
	
public Driver remove(Driver entity) {
	   
	   boolean result=this.repo.existsById (entity.getDriverId());
if(result)
{
	this.repo.delete(entity);
}
else {
	throw new NoSuchElementException("Element with id= "+entity.getDriverId()+"Not present");
}
   return entity;  
}

  
   public List<Driver> findByDriverName(String srchName){
	   return this.repo.findByDriverName(srchName);
   }
   public List<Driver> srchByMobileNumber(long number){
	   return this.repo.findByMobileNumber(number);
   }
   public List<Driver> srchByDriverRating(double rating){
	   return this.repo.searchByRating(rating);
   }
   public int modifyRating(int id, double updatedRating){
	   return this.repo.modifyRating(id, updatedRating);
   }
   public List<Driver>sortedList(String propName){
	   return this.repo.findAll(Sort.by(propName));
   }
}
