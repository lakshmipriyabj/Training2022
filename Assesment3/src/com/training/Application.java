package com.training;
import java.util.Set;

import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		
				Set<String> set =new TreeSet<>();
				
				set.add("Apple");
				set.add("Orange");
				set.add("Apple");
				set.add("Pineapple");
				set.add("Orange");
				set.add("Banana");
			
		
				for(String each:set)
			{
					System.out.println(each.toString());
				
			}
		
		}
	}
