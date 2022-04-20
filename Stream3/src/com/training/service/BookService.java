package com.training.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import static java.util.stream.Collectors.*; //collector.to not required collect(tolist)
public class BookService implements CrudRepository {
	
	private ArrayList<Book> bookList;
	

	public BookService() {
		super();
		this.bookList = new ArrayList<>();
	}


	@Override
	public boolean add(Book book) {
		
	//	boolean result = book.List.add(book);
		// return result;
		
		return bookList.add(book);
	}
	

	@Override
	public Book findById(int id)
	{
		Book found =null;
 		for(Book eachBook :this.bookList) 
 		{
 			if(eachBook.getBookNumber()==id ) 
 			{
 				found = eachBook;
 			}
 			//return found;
			
		}
		return found;
	}
		
		
		
	

	@Override
	public boolean remove(Book book) {
		
		return bookList.remove(book);
	}

	@Override
	public List<Book> findall() {
		
		return this.bookList;
	}


//	@Override
//	public Book update(Book book) {
//		if(this.bookList.contains(book)) {
//		//	System.out.println("======inside if block=======");
//			int idxpos = this.bookList.indexOf(book);
//			
//		}else {
//			//System.out.println("======inside else block ===");
//			add(book);
//		}
//		
//		return null;
//	}


	@Override
	public Book update(Book oldbook, Book newBook) {
		if(this.bookList.contains(oldbook)) {
//			//	System.out.println("======inside if block=======");
				int idxpos = this.bookList.indexOf(oldbook);
				this.bookList.set(idxpos,newBook);
		}
			
		return newBook;
	}
	//streams
	public List<Book> findBooksGrtThan(double price){
		 return this.bookList.stream()
				 .filter(e -> e.getPrice()>price)
				 .collect(toList());
		
	}
	public List<Book> sortedByNames() {
		   return  this.bookList
				   .stream()
				    .sorted(Comparator.comparing(Book::getBookName))
				      .collect(toList());
	}
		public List<Book> sortedByNumberDesc()
		{
		return this.bookList
				.stream()
				    .sorted(Comparator.reverseOrder())
				    .collect(toList());
		   }
	
	 public List<String> getBookNames() {
		   return  this.bookList
				   .stream()
				   .map(e -> e.getBookName())
				   .collect(toList());
		   }
	
	public List<String> getBookNameGrtThanPrice(double price)
	{
		return this.bookList.stream()
				.filter(e->e.getPrice()>price)
				.map(e->e.getBookName())
				.collect(toList());
	}
	
	
	public List<Book> getBooksGrtThan(double price)
	{
		List<Book>grtThanList=new ArrayList<>();


		Predicate<Double>grtThan = (value)-> value>price;
		
		this.bookList.forEach(book -> 
		{
			
	      double bookPrice = book.getPrice();
	      
	      if(grtThan.test(bookPrice))
	      {
	    	  grtThanList.add(book); 
	      }
		});
		return grtThanList;
				
	}
	

}
