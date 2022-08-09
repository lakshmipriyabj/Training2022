package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {
	
	@Autowired
	CabDriverService service;
	
	
	@BeforeAll
	void setUP() {
		CabDriver driver = new CabDriver(110,"Vatsan", 48553998,"Tvl",LocalDate.of(1998,6,10), 4.5);
		service.save(driver);	}

	@Test
	@DisplayName("First All Method should return a Empty Array")
	void testFindAllFailure() {
		assertTrue(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("First All Method should return an Array WithElement")
	void testFindAllSucess() {
		assertFalse(service.findAll().isEmpty());
	}

	
	@Test
	@DisplayName("FindById method should return an return an Element with the given Id")
	void testFindById()
	{
		assertEquals("Vatsan",service.findById(110).get().getDriverName());
	}
	
	@Test
	@DisplayName("FindById method should return an Exception if id not found ")
	void testFindByIdException()
	{
		CabDriver driver=service.findById(1100).orElseThrow(EntityNotFoundException::new);
		
		assertEquals("gjku",driver.getDriverName());
	}
	
	
	
}
