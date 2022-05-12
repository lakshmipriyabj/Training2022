package com.example.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@SpringBootApplication
public class SpringDataJpaSimpleMappingTaskEmployeeApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpaSimpleMappingTaskEmployeeApplication.class, args);
	    
	            Employee maha =ctx.getBean(Employee.class);
	            EmployeeService service = ctx.getBean(EmployeeService.class);
	            
	            
	   //for add
	        	//Employee added = service.add(maha);
	        	//if(added!=null) {
	        	//	System.out.println("One Employee Added");
	        	//}
	        
	  //findall
	            // service.findAll().forEach(System.out::println);
	            
	 //dateof birth
	            // service.findByDateOfBirth(LocalDate.of(2001,06,18)).forEach(System.out::println);
	 //locationandskillset
	          // service.findByLocationAndSkillSet("avadi","javaDevop").forEach(System.out::println);
	 //bylocation
	          // service.findByLocation("avadi").forEach(System.out::println);
	 //byskillset
	          //  service.findBySkillSet("db").forEach(System.out::println);
	          
	//location or skillset
	           service.getBySkillLoca("db","avadi").forEach(System.out::println);
	          
	            ctx.close();      
	}
	
	
	@Bean
	public Employee maha()
	{
	  return  new Employee(101,"Swethana",LocalDate.of(2001,Month.APRIL,8),"Poonamalle","JavaDevop",9879765L);
	}
		
		
	
}
