package com.training;

import java.util.Arrays;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		  List<String> names = Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		  for(String eachName:names) {
			  System.out.println(eachName);
		  }
		  
		  System.out.println("=------------");
   names.forEach(value ->System.out.println(value)); //same ans
   System.out.println("---------");
 //Method Reference
  names.forEach(System.out::println);//same ans :: --> reference
	}

}
