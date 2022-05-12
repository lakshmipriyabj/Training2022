package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.DoctorRepository;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;

@Component
public class DoctorUtils {
	
	@Autowired
	List<Patient> patientList;
	
    @Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create()
	{
		doc.setPatientList(patientList);
		Doctor added = repo.save(doc);
		
		if(added!=null) {
			System.out.println("One Row Added");
		}
	}
	public void findAll()
	{
		List<Doctor> doctors=repo.findAll();
		for(Doctor eachDoctor:doctors)
		{
			System.out.println("Doctor Name:"+eachDoctor.getDoctorName());
			System.out.println("Department: "+eachDoctor.getDepartment());
			List<Patient> patients=eachDoctor.getPatientList();
			for(Patient eachPatients:patients)
			{
				System.out.println("Patient Name: "+eachPatients.getPatientName());
				System.out.println("Patient Number : "+eachPatients.getMobileNumber());
			}
		}
	

    }
}
