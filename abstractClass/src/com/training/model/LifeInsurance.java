package com.training.model;

public class LifeInsurance extends Insurance {
	 
	//Add a property age
	// add Constructor and setter getter method
	// override calculatepremium method, if age < 50  premium is 5000 else 10000
	// test the class from main method 
	
	private int age;

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public LifeInsurance(int age) {
		super();
		this.age = age;
	}

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
	}



	public LifeInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		  double premium=10000;
		  
		if(age<50)
		{ 
		   premium=5000;
		}
		
		
		return premium;
	}
	

}
