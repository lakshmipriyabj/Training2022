package com.training;

import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.service.BookService;

public class Application {
	
	public static void print(List<Book> books) {
//		for(Book eachBook:books) {
//			System.out.println(eachBook);
//		}
		books.forEach(System.out::println);
	}

	public static void main(String[] args) 
	{
	        
		Book java = new Book(101,"java","Suba",450);
		
		Book spring= new Book(102,"spring","Mad",650);
		Book maven= new Book(103,"Maven","Harish",550);
		Book html= new Book(104,"html","Priya",1450);
		Book python = new Book(105,"Python","Sathya",850);
		
		
		
	
		
		BookService service = new BookService();
		
	    System.out.println(service.add(java));
		System.out.println(service.add(spring));
		System.out.println(service.add(maven));
		System.out.println(service.add(html));
		System.out.println(service.add(python));
		
		
		
		List<Book> bookList = service.findall();
		
		print(bookList);
//     	for(Book eachBook : bookList){
//	      System.out.println(eachBook);
//     	}
		
    	
     	System.out.println("===============");
		
		Book foundBook = service.findById(101);
		
		System.out.println("Found Book" +foundBook);
		
		System.out.println("===============");
		
		System.out.println(service.remove(maven));
		
//	     List<Book> SecondList = service.findall();
//	     for(Book eachBook2:SecondList) {
//	    	 System.out.println(eachBook2);
//	     }
//		
		print(service.findall());
	
		Book react = new Book(106,"ReactJS","Rahul",6850);
		service.add(react);
		System.out.println("========after update=====");
		
		print(service.findall());
		
		Book reactNew = new Book(106,"ReactJS","Rahul kkkk",6850);
		service.update(react,reactNew);
		System.out.println("========after update=====");
		print(service.findall());
		
		
		
				
				System.out.println("is added="+service.add(java));
				service.add(spring);
				service.add(java);
				service.add(maven);
				service.add(html);
				service.add(python);
				
				CrudRepository service1=new BookService();
				List<Book> bookList1=((BookService)service).getBooksGrtThan(600);
				
				System.out.println("===========");
				
				bookList1.forEach(System.out::println);
				
                System.out.println("+++");
		//for(Book eachBook : bookList)
	}
	


}
