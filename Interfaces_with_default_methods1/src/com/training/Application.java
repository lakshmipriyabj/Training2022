package com.training;

import com.training.ifaces.Conditional;
import com.training.services.StudentResultService;

public class Application {
	public static void main(String[] args) {
		
	
	
	StudentResultService service = new StudentResultService();
	System.out.println("is pass:"+service.test(90.00));
	System.out.println("is fail:"+service.negate(90.00)); //default method in the interface 
     System.out.println(Conditional.getMessage());
}
}