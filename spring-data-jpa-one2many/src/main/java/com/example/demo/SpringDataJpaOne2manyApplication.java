package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
	        DoctorUtils obj = ctx.getBean(DoctorUtils.class);
	        obj.create();
	        
	        obj.findAll();
	        
	        ctx.close();
	}
	
	@Bean
	public Doctor munna()
	{
		Doctor doc = new Doctor();
		doc.setDoctorId(2020);
		doc.setDoctorName("Munna");
		doc.setDepartment("Cardio");
		doc.setPhoneNumber(7753654);
	    
		return doc;
		
	}
	
	@Bean
	public Patient kavi()
	{
		return new Patient(100,"kavitha",54678765);
	}
	@Bean
	public Patient pavi()
	{
		return new Patient(200,"pavithra",5467342);
	}
	@Bean
	public Patient Ravi()
	{
		return new Patient(300,"RaviRaj",546765634);
	}

}
