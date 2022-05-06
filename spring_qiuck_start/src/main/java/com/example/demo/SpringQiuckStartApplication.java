package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Bill;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;


@SpringBootApplication

public class SpringQiuckStartApplication {
	
	public static void trail()
	{
		 ApplicationContext ctx =null;
		 //when  using ID need to cast to specific Bean since
	    //return type of getBean Method is Object
	      //using constructor 
		//Student ram = (Student)ctx.getBean("ram");
	    System.out.println(ctx.getBean("ram"));
			
		
		//Casting not required ,but there should be only one bean of that type 
		//will throw exception 
////		Student shyam = ctx.getBean(Student.class);
			//without giving method 
		//	System.out.println(ctx.getBean("teacher"));
			
			
			
		//	Teacher teacher1 =(Teacher) ctx.getBean("stella");

			//using setter
		//when more than one bean of the same type available 
		//should use id and class name
			Teacher stella =ctx.getBean("stella",Teacher.class);
			Teacher teacher1 = (Teacher) ctx.getBean("harish");
			System.out.println(teacher1);
		
			stella.setId(494);
			stella.setName("Stella Sundari");
			stella.setSubject("Fluid Mech");
			System.out.println(stella);
			
		//	Teacher harish = ctx.getBean()
		//	System.out.println(ctx.getBean("harish"));
			
		}
		

	


	public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringQiuckStartApplication.class, args);
    
    Invoice inv = ctx.getBean(Invoice.class);
    System.out.println(inv);
   
    
    Bill bill = ctx.getBean(Bill.class);
    System.out.println("Customer:" + bill.getCustomer());
    System.out.println("Product:" + bill.getProduct());
    
  CustomerList list =   ctx.getBean(CustomerList.class);
    list.getCustList().forEach(System.out::println);
}
}
