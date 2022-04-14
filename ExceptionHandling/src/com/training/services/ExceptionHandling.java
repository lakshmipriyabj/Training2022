package com.training.services;

public class ExceptionHandling {
	
	public void  usingArrayIndexException(String[] args) {
		
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Method requires three values to be passed [a,b,c] ");
			
			e.printStackTrace();
		}
	}
	
   public void usingNumberFormatException(String value) {
	
	   int age= 4;
	try {
		age = Integer.parseInt(value);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		System.out.println("value should be passed");
		e.printStackTrace();
	}
	   System.out.println(age);
}
   
   public void usingFinallyBlock() {
	   int denominator=0;
	   try {
		System.out.println(4/denominator);
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.err.println("Denominator should not be zero");
	}
	   finally {
		   System.out.println("Inside FINALLY==");
	   }
	   System.out.println("Thanks,bye,bye");
   }
   
   public String underStandFinallyBlock()  {
	   int denominator=0;
	   try {
		System.out.println(4/denominator);
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.err.println("Denominator should not be zero");
		
		//return "welcome";
		try {
			throw new Exception();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		   
		
	}  
	   finally {
		   System.out.println("==Inside FINALLY==");
	   }
	   System.out.println("bye,bye");
	   
	   return "thanks";
	   
   }

}

