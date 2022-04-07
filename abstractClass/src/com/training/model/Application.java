package com.training.model;

import com.training.model.VechicleInsurance;

import com.training.model.Insurance;

public class Application {
	
	public static void printPremium(Insurance object) {
		
		System.out.println("Premium:="+object.calculatePremium());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VechicleInsurance car = new VechicleInsurance(1010, "ramesh", "car", 2019 );
		
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(123,"jeri",21);
		
		printPremium(life);
		
		
		String[] illness = {"ent","thyroid"};
		
		HealthInsurance health = new HealthInsurance(3000,"Vicky",illness);
		
		printPremium(health);

	}

}
