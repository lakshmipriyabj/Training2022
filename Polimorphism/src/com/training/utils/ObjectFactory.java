package com.training.utils;

import com.training.ifaces.Conditional;
import com.training.ifaces.Professor;
import com.training.ifaces.Student;

public class ObjectFactory {
	public Conditional getConditional(int key)
	{
		switch (key) {
		case 1:
			return new Professor("phd");
		case 2: 
			return new Student(89);

		default:
			return null;
		
		}
		
	}
	public double getValue(Conditional obj,Object value ) {
		
		//here poly reference type is conditional 
		
		boolean result = obj.test(value);
		
		double travelAlllowance = 1000;
		if (result) {
			
			travelAlllowance= 2000;
			
		}
		
		return  travelAlllowance;
	}
	}


