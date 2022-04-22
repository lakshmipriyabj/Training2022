package com.training.service;



import java.util.*;

import com.training.model.Product;

public class ProductService {

	public TreeSet<Product> product;
	public List<Product> getTopThree(){
		
		Iterator<Product> itr =product.iterator();
		while(itr.hasNext())
		{
		   Product proObj=itr.next();
		   System.out.println();
		}
		
	}
}
