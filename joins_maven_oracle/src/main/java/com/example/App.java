package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.example.services.CustomerServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Connection con;
       try {
    	   Customer cust = new Customer(1009,"priya",97634565,550);
    	   LoanApplication loan = new LoanApplication(8,cust,200000);
    	   
    	   
    	   
       con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
   		System.out.println(con);
   		CustomerServices service = new CustomerServices(con);
   		//service.findAll().forEach(System.out::println);
   		System.out.println(service.findById(1002));
   		System.out.println(service.add(loan));
       }catch(SQLException e) {
    	   e.printStackTrace();
       }
       
    }
}
