package com.training;

import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectFactory factory = new NewObjectFactory();
		
		// factory.getConditional(1);
		
		Conditional proObj = factory.getConditional(1);
		Conditional studObj = factory.getConditional(2);
		Conditional prnObj = factory.getConditional(3);
		
     System.out.println("Allowance:=" +factory.getValue(proObj, "chennai"));
     System.out.println("Allowance:=" +factory.getValue(studObj, "ece"));
     System.out.println("Allowance:=" +factory.getValue(prnObj, "engg"));
     
		 
	}

}
