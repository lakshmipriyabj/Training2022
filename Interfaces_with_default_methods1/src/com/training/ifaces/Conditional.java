package com.training.ifaces;

//@FunctionalInterface

public interface Conditional<T> {
	//abstract
	public boolean test(T t);
	//default 
	default public boolean negate(Double value)
	{
		
	return  value<=80.00;
	}
	//static
     static String getMessage() {
	 return "static method in interface-yes its real";
 }
}
