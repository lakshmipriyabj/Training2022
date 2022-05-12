package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
	Doctor priya =ctx.getBean(Doctor.class);
	DoctorService service = ctx.getBean(DoctorService.class);
	
	
	//get name or dept
	
	          System.out.println(service.getByNameDept("LAKSHMI PRIYA","Cardio"));

	//findby docnameanddept
          // service.findByDoctorNameAndDepartment("LAKSHMI PRIYA","Cardio").forEach(System.out::println);
	//find by doctor name
          //	System.out.println(service.findByDoctorName("maha"));
	//find by department
           //	service.findByDepartment("Cardio").forEach(System.out::println);
	//find all
          //	service.findAll().forEach(System.out::println);
    //	for add
         //	Doctor added = service.add(priya);
    //	if(added!=null) {
          //		System.out.println("One Doctor Added");
        //	}
	ctx.close();
	}
  @Bean
  public Doctor priya() {
	  return new Doctor(02,"PRIYA","Cardio",998776864);
  }
}
