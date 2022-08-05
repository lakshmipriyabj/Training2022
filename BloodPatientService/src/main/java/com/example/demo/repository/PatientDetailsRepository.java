package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PatientDetail;

public interface PatientDetailsRepository extends JpaRepository<PatientDetail,Integer> {

	
   PatientDetail findByLocation(String loc);
   
   List<PatientDetail> findByBloodGroup(String grp);

}
