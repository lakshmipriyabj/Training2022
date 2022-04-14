package com.training.ifaces;

import java.util.List;

import com.training.model.Book;

public interface CrudRepository {
	
	public boolean add(Book book);
	public Book findById(int id);
	public boolean remove(Book book);
	public List<Book> findall();
	public Book update(Book oldbook,Book recentBook);
	
	

}
