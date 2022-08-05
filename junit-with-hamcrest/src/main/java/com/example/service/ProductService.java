package com.example.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ProductService {
	
	public double findDiscount(String product) {
		
		double discount = 0.10;
		
		if(product.equals("tv") || product.equals("laptop")) {
			
			discount = 0.20;
		}
		return discount;
	}
	
	
		public List<String> findProduct(){
			List<String> list =Arrays.asList("lenova","dell","hp","aces");
			return list;
		}
//		public String[] findProduct(){
//		  String[] strings = {"lenova", "dell", "hp"};
//		
//		return strings; }
}
