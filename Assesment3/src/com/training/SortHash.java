package com.training;

import java.util.Set;
import java.util.TreeSet;

public class SortHash {

	public static void main(String[] args) {
		
		
		Sort item1 = new Sort("Apple");
		Sort item2 = new Sort("Orange");
		Sort item3 = new Sort("Apple");
		Sort item4 = new Sort("PineApple");
		Sort item5 = new Sort("Orange");
		Sort item6 = new Sort("Banana");
		HashSet<String> set = new HashSet<>();
			
		
		set.add(item1);
		set.add(item2);
		set.add(item3);
		set.add(item4);
		set.add(item5);
		set.add(item6);
		
		for(String each :set) {
		
		System.out.println(each.getFruites());

System.out.println(each.toString());
	}

}
}


//package com.training;
//
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Application {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Set<String>set=new TreeSet<>();
//		
//		set.add("apple");
//		set.add("orange");
//		set.add("apple");
//		set.add("pineapple");
//		set.add("orange");
//		set.add("banana");
//		int pos=0;
//
//		for(String s:set)
//	{
//			System.out.println(s.toString() +"  "+"Index Position "+pos);
//			pos++;
//		
//	}
//
//}}