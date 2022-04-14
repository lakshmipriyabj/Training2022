package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMapApp2 {

	public static void main(String[] args) {
		
		Student ram = new Student(101,"ram",78);

		Student shyam = new Student(102,"shyam",68);
		Student mukesh = new Student(103,"mukesh",78);
		
      HashMap<Integer, Student> map = new HashMap<>();
      
      map.put(900, ram);
      map.put(902, shyam);
      map.put(904, mukesh);
      
      System.out.println( map.get(900));
      System.out.println(map.get(902));
      System.out.println(map.get(904)); 
      
      Set<Integer> keys = map.keySet();
      System.out.println(keys);
      
      //for print at a time instead of usin syso use for
      for(Integer key :keys) {
    	  System.out.println(map.get(key));
      }
      System.out.println("==============");
      //values
      Collection<Student> list =map.values();
     for(Student eachStudent:list) {
    	 System.out.println(eachStudent);
     }

     
     System.out.println("both the key and values ");
     
     Set<Map.Entry<Integer,Student>> list2= map.entrySet();
     for(Map.Entry<Integer, Student> eachEntry : list2) {
    	 System.out.println(eachEntry.getKey());
    	 System.out.println(eachEntry.getValue());
     }
	}

}
