package com.example.demo.entity;

import java.time.LocalDate;



import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;






@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientDetail {
	
	
	int patientId;
	
	
	String patientName;
	
	
	String bloodGroup;
	
	
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	

	String location;
	
	
	long mobileNumber;
	
	

}
