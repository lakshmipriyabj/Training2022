package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
//	Book java = new Book(102, "First Java" , "rak" , 780);
		
		BookService service = new BookService();
		
//		boolean result = service.writeToFile(new File("Books.txt"), java);
//		
//		if(result) {
//			
//			System.out.println("One Record is Added To File");
			
			service.readFromFile(new File("Books.txt"))
            .forEach(System.out::println);;
		

	}

	//}
}
