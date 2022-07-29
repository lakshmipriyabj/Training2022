package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {
	
	@Test
	@DisplayName(value = "Test the Get Message return a String of Length 8 Characters")
	void testMaxLength() {
		
		Greeting grtObj = new Greeting();
		
		int actual = grtObj.getMessage().length();
		
		int expected = 5;
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	@DisplayName(value = "Test the Birthday Wish Method does not return null")
	void testBirthdayDayWish() {
		
		Greeting grtObj = new Greeting();
		
		String actual = grtObj.birthDayWish("Priya");
		
		assertNotNull(actual);
	}
	
   @Test
   @DisplayName("Test Birthday Wish Method should return Happy Birthday with user name suffixed")
   void testBirthdayWishReturnValue() {
	   
	   Greeting grtObj = new Greeting();
	   
	   String name ="Priya";
	   
	   String actual = grtObj.birthDayWish(name);
	   String expected = "Happy Birthday" + name;
	   assertEquals(expected, actual);
	   
	   
//	   String expected = grtObj.birthDayWish("Happy Birthday Priya");
//	   
//	   assertEquals(expected, actual);
   }
}
