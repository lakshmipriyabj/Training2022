package com.training;

import java.util.Optional;

public class UsingOptional {
	
	
	public static Optional<String> getvalue(int key)
	{
		Optional<String> response = Optional.empty();
		if(key ==1)
		{
			response = Optional.of("hi");
		}
		return response;
	
	}
	

	//null pointer exception
	public static Object getString(int key) {
		switch (key) {
		case 1:
			return new String("Chocobar");
		case 2:
			return new String("Cassatta");
			default:
				return null;
			
		}
		
	}
	

	public static void main(String[] args) {
		//method2
  // will throw null pointer exception for values 3 and above 
 // System.out.println(getString(3).toString());
   // to avoid nullpointer exception and return a default value 
  //new feature of java 8 optional
  //one way 
		//nullable means
  Optional<Object> optional = Optional.ofNullable(getString(3));
  System.out.println(optional.orElse("Vannila").toString());
  
  //2nd way
  
  Optional<Object> optional2 = Optional.ofNullable(getString(2));
  if(optional2.isPresent())
  {
	  System.out.println("Value is present" +optional2.get());
  }else {
	  System.out.println("Value is not present ");
	  
  }
  //using lamda with optional
  Optional<Object> optional3 = Optional.ofNullable(getString(2));
  
  optional3.orElseThrow(
		  ()-> new RuntimeException("no object for value 3 try again"));
  
  
///method1
	//call the getvalue method by passing 1 as argument
	  //call the same method again by passing 2 as argument
	  //print the results

Optional<String> resp= getvalue(1);
{
if(resp.isPresent()) {
	 System.out.println(resp.get().toString());
}else {
System.out.println("Invalid choice enter1");
}
resp.orElseThrow(
		  ()-> new RuntimeException("Invalid enter 1"));


  //use the same method but throw exception 
	}

}
}
