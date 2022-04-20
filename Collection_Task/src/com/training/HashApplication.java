package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.model.Appointment;
import com.training.model.Doctor;
import com.training.model.Patient;



public class HashApplication {

	public static void main(String[] args) {
		
		Patient patient1 = new Patient(01,"Priya","Avadi",987764342);
		Patient patient2 = new Patient(02,"riya","chennai",987864342);
		Patient patient3 = new Patient(03,"maha","Thirumazhisai",987434244);
		Patient patient4 = new Patient(04,"jeri","jerisalam",985564342);
		
		Set<Patient> set = new HashSet<>();
		
		set.add(patient1);
		set.add(patient2);
		set.add(patient3);
		set.add(patient4);
		
		
		
	//	Set<Doctor> set2 = new HashSet<>();
		Doctor doc1= new Doctor(001, "lakshmi","dental",set);
		System.out.println("Doctor" + doc1.getDoctorName());
		for(Patient eachPatient: doc1.getPatient()) {
			System.out.println(eachPatient);
		}
	
//		Doctor doc2 = new Doctor(002,"Swethana","cardiologist",set);
//		//Set<Patient>obj=doc2.getPatient();   for(Patient eachPatient: doc2) 
//	System.out.println("Doctor"+doc2.getPatient());
//		for(Patient eachPatient: doc2.getPatient()) {
//		System.out.println(eachPatient);
//	
//	}
//		System.out.println("===========");
//	
//		Map<Doctor,Set<Patient>> map = new HashMap<>(); 
//		
//		map.put(doc1, patient1);
//		map.put(doc2, patient2);
//		Appointment obj =new Appointment(map);
//		    
//		Map<Doctor, Patient> obj = obj.get
//		
			
		}
			
		}
	


