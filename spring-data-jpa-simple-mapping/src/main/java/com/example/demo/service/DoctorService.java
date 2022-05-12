package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorService {
	
	private DoctorRepository repo;
	
	
    @Autowired
	public DoctorService(DoctorRepository repo) {
		super();
		this.repo = repo;
	}

	public Doctor add(Doctor entity) {

	return this.repo.save(entity);

	}

	public List<Doctor> findAll(){

	return this.repo.findAll();
	}

   public List<Doctor> findByDepartment(String srchString){
    return this.repo.findByDepartment(srchString);
}
   public List<Doctor> findByDoctorName(String srchString){
	   return this.repo.findByDoctorName(srchString);
	   }
   public List<Doctor> findByDoctorNameAndDepartment(String name,String dept){
	   return this.repo.findByDoctorNameAndDepartment(name, dept);
	   
   }
   public List<Doctor> getByNameDept(String docName,String dept)
   {
	   return this.repo.getByNameDept(docName, dept);
   }
}
