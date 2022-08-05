package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.model.Book;
import com.example.service.BookService;

public class BookServiceTest {
	
	
	
	BookService service;
	
	@BeforeEach
	public void setUp(TestInfo info) {
		
		service = new BookService();
	}
	
	@BeforeAll
	public static void  init(TestInfo info) {
		
		System.out.println(info.getDisplayName()+"Called");
	}
	
	
	
	@Test
	@DisplayName("Get Method should not return null value")
	void testGetBookMethod() {
		
		Object actual = service.getBookList();
		
		assertNotNull(actual);
	}
	
	
	@Test
	@DisplayName("add method should return 1 for success and 0 for failure to insert")
	void testAddMethodReturn() {
		
		BookService service = new BookService();
		
		int actual = service.addBook(new Book());
		
		int expected = 1;
		
		assertEquals(expected,actual);

		
	}
	
	@Test
	@DisplayName("add book method should not accept duplicate values")
	
	void testDuplicate() {
		BookService service = new BookService();
//	assertAll("Testing Add Book",
//				() -> assertEquals(0,service.addBook(new Book(101,"java",450.0))),
//		
//				() -> assertEquals(1,service.addBook(new Book(101,"java",450.0)))
//
//                 );
		
		
		int act1 = service.addBook(new Book(101,"java",340.0)) ;
		int actual = service.addBook(new Book(101,"java",340.0));
		
		int expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
//	@DisplayName(value="If the element is not found in the collection removeBook method should throw"
//	       + "Runtime exception with message"
//			+ "element not found")
	//@Disabled
	void testRemove()
	{
		BookService service= new BookService();
	    Book book=new Book(102, "java", 450.0);
		Throwable exception =
	            assertThrows(RuntimeException.class, ()->service.removeBook(book));
		assertEquals("Invalid Number",exception.getMessage());
		
//		Throwable exception = assertThrows(RuntimeException.class, ()->
//		service.removeBook(new Book (101,"java",340.0)));
//		assertEquals("Element Not Found",exception.getMessage());
		
	}
	
	
	@DisplayName(value="Test if getBestBook method has the value Head First Java in one first three positions")
	@ParameterizedTest
	@ValueSource(ints = {0,1,2})
	void testGetBestBook(int pox) {
		
		//System.out.println(System.getProperty("os.name"));
		
  //    assumeTrue(System.getProperty("os.name").equals("Windows 8"));  
        
		assertEquals("Head First Java", service.getBestBooks().get(pox));
	}
	

}
