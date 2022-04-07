package com.training;

public class Application {

	public static void main(String[] args) {
		
		Greeting grtObj = new Greeting();
		
		System.out.println(grtObj.getMessage()); //non-static method
		
		System.out.println(Greeting.getInfo()); //static method
		
        // System s = new System(); // constructor of the system is  private ,
		
	    System.out.println(grtObj.getInfo()); //with error non static method cannot be created with object
	    }

	}




