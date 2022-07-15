package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repo.TripDetailRepository;

@Service
public class TripDetailService {
	
	public TripDetailRepository repo;

	@Autowired
	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public List<TripDetail> findAll()
	{
		return this.repo.findAll();
	}
	
	public List<TripDetail> findByDriverId(int id){
		
		return this.repo.findByDriverId(id);
	}
	
	public TripDetail save(TripDetail entity) {
		
		return this.repo.save(entity);
	}
	

}
