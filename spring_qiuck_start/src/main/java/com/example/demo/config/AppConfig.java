package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	//ID of the bean as the method name
	@Bean
	public Student ram()
	{
		return new Student(101,"Ramesh",89);
	}
	
	@Bean
	public Teacher harish()
	{
		return new Teacher(2,"Harish","Java");
	}

	@Bean
	public Product tv()
	{
		return new Product(101,"sony tv");
	}
	
	
	@Bean
	public Customer suresh() {
		return new Customer(202,"Suresh");
				
	}
	

	@Bean
	public Customer ramesh() {
		return new Customer(202,"Ramesh");
				
	}
	
	@Bean
	public Customer rajesh() {
		return new Customer(202,"Rajesh");
				
	}
}

