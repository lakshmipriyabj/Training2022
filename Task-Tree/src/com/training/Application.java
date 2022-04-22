package com.training;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.Product;

public class Application {

	public static void main(String[] args) {
	
		Product pro1 = new Product(01,"Pencil",10);
		Product pro2 = new Product(01,"Pen",20);
		Product pro3 = new Product(01,"Scale",50);
		Product pro4 = new Product(01,"Eraser",05);
		Product pro5 = new Product(01,"Marker",80);
//		Product pro1 = new Product(01,"Pencil",10);
//		Product pro1 = new Product(01,"Pencil",10);
//		Product pro1 = new Product(01,"Pencil",10);
		
     Set<Product> product = new TreeSet<>();
     product.add(pro1);
     product.add(pro2);
     product.add(pro3);
     product.add(pro4);
     product.add(pro5);
      
	}

}
