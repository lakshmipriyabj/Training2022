package com.training;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.model.Appointment;
import com.training.model.Doctor;
import com.training.model.Patient;

public class ApointmentAppli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient1=new Patient(001,"Revathy","Chennai",997865432);
		Patient patient2=new Patient(002,"Arya","Namakal",987865432);
		Set<Patient> set1=new HashSet<>();
		set1.add(patient1);
		set1.add(patient2);	
		
		Doctor doctor1=new Doctor(111,"Ravi","ENT",set1);
		
		
		Patient patient3=new Patient(003,"Ravi","Chennai",97865432);
		Patient patient4=new Patient(004,"Lakshimi","Salem",998965432);
	
		Set<Patient> set2=new HashSet<>();
		set2.add(patient3);
		set2.add(patient4);
		
	
		Doctor doctor2=new Doctor(112,"Raja","cardio",set2);
		
		Map<Doctor,Set<Patient>> map=new HashMap<>();
		map.put(doctor1, set1);
		map.put(doctor2, set2);
		Appointment app=new Appointment (map);
		System.out.println(app.get(doctor1));
		System.out.println(app.get(doctor2));
		
	}
}