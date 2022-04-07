package com.training4;
import com.training1.Customer;
import com.training2.Employee;
import com.training3.Hotel;

public class Application {

	public static void main(String[] args) {
		
		//creating cus constructor
		
		Customer cusObj = new Customer("lakshmi", "c123", 45678875, "chennai");
		System.out.println("CustomerName:" +cusObj.getName());
		System.out.println("CustomerId:"+cusObj.getId());
		System.out.println("CustomerNumber:"+cusObj.getMobile_num());
		System.out.println("CustomerId:"+cusObj.getAddress());
		
		
		
		
		
      	Employee empObj = new Employee("yuga","h89",99099877,50000,"lkk@");
      	System.out.println("\nEmployeeN:" +empObj.getName());
    	System.out.println(" EmployeeId:" +empObj.getId());
    	System.out.println("  EmployeeMobileNumber:" +empObj.getMobile_Num());
    	System.out.println("EmployeeSalary:" +empObj.getSalary());
    	System.out.println("EmployeeAddress:" +empObj.getEmailId());
    	
    	
    	Hotel  obj = new Hotel("HILTON","spa",100,"non-veg",5);
    	System.out.println("\n HotelName:"+obj.getName());
    	System.out.println("ServiceProvider:" +obj.getCusion());
    	System.out.println("rooms:"+obj.getRoom());
    	System.out.println("cuisine:" +obj.getCusion());
    	System.out.println("Rating:"+obj.getRating());
    	
    	
    	
//    	EmployeeService emp = new EmployeeService();
//    	
//    	
//    	   System.out.println(emp.calculateBonus(employee));
    	
    	
    	EmployeeService ebn=new EmployeeService();
       	
    	   System.out.println(ebn.calculateBonus(empObj));



	}
}


