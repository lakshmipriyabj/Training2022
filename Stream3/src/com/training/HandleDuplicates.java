package com.training;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
public class HandleDuplicates {

	public static void main(String[] args) {
		
		List<Integer> ageList=Arrays.asList(45,55,65,78,55,80,45);
		
	//	System.out.println(ageList);
		
		Set<Integer> filtered = new HashSet<>();
		
		List<Integer> list =
				ageList
				.stream()
				   .filter(e-> !filtered.add(e))   //! for duplicate
				    .collect(toList());
		
		System.out.println(list);
				   
		
	

	}

}
