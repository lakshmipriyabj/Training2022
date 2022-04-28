package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.service.ProductService;
import com.example.entity.Product;


public class Application {

	public static void main(String[] args) {
		
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			System.out.println(con);
			
			ProductService service = new ProductService(con);
			
			
			
//			Product toAdd = new Product(9,"ups",470.00);
//			int rowAdded = service.addProduct(toAdd);
//			System.out.println("Row Added:=" +rowAdded);
	//		Product toAdd1 = new Product(8,"cpu",470.00);
	//		int rowAdded2 = service.addProduct(toAdd1);
	//		System.out.println("Row Added:=" +rowAdded2);
			//Product toAdd2 = new Product(7,"whiteboard",450);
			//int rowAdded3 = service.addProduct(toAdd2);
			//System.out.println("Row Added:=" +rowAdded3);
			
			
//			int rowDeleted =service.deleteById(9);
//		    System.out.println("Row Deleted:" +rowDeleted);
			
//		   Optional<Product> found = service.findById(1);
//		   if(found.isPresent()) {
//			   System.out.println(found.get());
//			   
//		   } else {
//			   System.out.println("Product with given id not Present");
//		   }
		   
		   int rowsUpdated = service.updatePriceByName("mobile", 700.0);
		   System.out.println("Row Updated:" +rowsUpdated);
		   service.findAll().forEach(System.out::println);
			
		}
	   catch(SQLException e) 
		{
		e.printStackTrace();
	    }
		
	}

}
