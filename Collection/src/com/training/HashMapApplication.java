package com.training;
import java.util.*;

import com.training.model.Student;

public class HashMapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(101,"ram",78);

		Student shyam = new Student(102,"shyam",68);
		Student mukesh = new Student(103,"mukesh",78);
		
      HashMap<Integer, Student> map = new HashMap<>();
    
     System.out.println(map.put(900, ram)); //key is not there if return null
     System.out.println( map.put(902, shyam));
    // System.out.println( map.put(902,mukesh));
     
     Student added = map.put(902, mukesh);
     
     if(added!=null) {
    	 map.put(904, added);
     }
     
     System.out.println( map.get(902));

      System.out.println(map.get(904)); 

	}

}
