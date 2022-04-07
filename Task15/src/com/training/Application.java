package com.training;

import com.training.ifaces.Automobile;
import com.training.model.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		
		ObjectFactory factory = new ObjectFactory();
		
		System.out.println("----------"+ Automobile.SHOWROOM +"------");
		
		Automobile maruti = factory.getObject(1);
		
		factory.printQuote(maruti);
		
		System.out.println("----------");
		
        Automobile toyota = factory.getObject(3);
		
		factory.printQuote(toyota);

	}
}
