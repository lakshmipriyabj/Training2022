package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.Utility;


@SpringBootApplication
public class SpringDataJpaBidirectionalApplication{

	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaBidirectionalApplication.class, args);
	
	
	Utility obj = ctx.getBean(Utility.class);
	
	obj.create();
	
	obj.findAll();
	
	ctx.close();
	
	}

	
	@Bean
	public Doctor munna() {
	Doctor doc = new Doctor();
	 doc.setDoctorId(2020);
	 doc.setDoctorName("Munna");
	 doc.setPhoneNumber(247874585);
	 doc.setDepartment("Vetenerian");
	
	return doc;
		
	}
	@Bean
	public Patient priya(){
		
		return new Patient(100 , "priya" ,45688);
	}
	
	@Bean
	public Patient pavi(){
		
		return new Patient(200 , "Pavithra" ,457858);
	}
	
	@Bean
	public Patient Ravi(){
		
		return new Patient(300 , "Ravithra" ,45684478);
	}
}