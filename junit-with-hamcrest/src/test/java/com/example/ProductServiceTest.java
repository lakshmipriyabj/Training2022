package com.example;



import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.example.service.ProductService;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProductServiceTest {
	
	ProductService service = null;
	@BeforeEach
	void init() {
		service = new ProductService();
	}
	
	@DisplayName(value="Test findDiscount method returns 0.20 or above for tv and laptop")
	@Test
	void testFindDiscount() {
		
		double actual = service.findDiscount("tv");
		
		assertThat(actual, is(greaterThan(0.19)));
		
	}
	
	@DisplayName(value="Test findDiscount method returns 0.10 or above for tv and laptop")
	@Test
	void testFindDiscountCaseTwo() {
		
		double actual = service.findDiscount("fridge");
		
		assertThat(actual, is(lessThan(0.19)));
		
	}
	
	@DisplayName(value="Test findProduct method return a list of size")
	@Test
	void testfindProductSize() {
		//String[] actual = service.findProduct();
		List<String> actual = service.findProduct();
		int act = actual.size();
		int size = 4;
		assertThat(act,equalTo(size));
	}
	
	
	
	

	@DisplayName(value="Test findProduct method return a list of containing")
	@Test
	void testfindProduct() {
		
//	    fail("not yet implemented");
		//String[] actual = service.findProduct();
	      List<String> actual = service.findProduct();
	      assertThat(actual,is(hasItems("lenova","dell","hp","aces")));
	    //  assertThat(actual, is(arrayContaining("lenova", "dell", "hp")));
	}

}
