package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.model.Book;

public class BookService {
	
	private Set<Book> bookList;
	
	
	
	public BookService() {
		super();
		this.bookList = new HashSet<>();
	}

    public Set<Book> getBookList(){
		return this.bookList;	
	}
    
    public int addBook(Book book) {
    	return (this.bookList.add(book)?1:0);
    }
    
    public int duplicateBook(Book book) {
    	return (this.bookList.add(book)?1:0);
    }

    public Boolean removeBook(Book book) {
    	boolean result = false;
    	
    	if(this.bookList.contains(book)) {
    		this.bookList.remove(book);
    		result = true;
    	}
    	else {
    		throw new RuntimeException("Invalid Number");
    	}
		return result;
    }
    
    public List<String> getBestBooks()
    {
    	List<String> list = Arrays.asList("Head First Java","PassBook","CookBook");
    	return list;
    }
}
