package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;

public class Application {

	public static void main(String[] args) {
	
		
		//subtype = new subtype
		
	//	CurrencyConverter conv = new CurrencyConverter();
		// supertype = subtype
		Function conv = new CurrencyConverter();
		
		double response = conv.apply(200);

		System.out.println(response);
		
//		// line 10 and 12 and line 16 are identical
//		
		System.out.println(conv.apply(300));
		
		System.out.println(Function.COUNTER);

		
		if(conv instanceof CheckCondition)
		{
			CheckCondition obj = (CheckCondition)conv;
		
		System.out.println("Is Discount Allowed:="+obj.test(300));
		} else {
			System.out.println("cannot be cast");
		}
		
		Conditional condObj = new DiscountCalculator();
		System.out.println(condObj.test(6000));
		System.out.println(condObj.test(400));
		
	
	}

}
