package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.BDDMockito;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class CabDriverTest 
{
	
	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	CabDriverService service;
	
	private CabDriver jagan;
	private CabDriver kugan;
	private CabDriver damu;
	
	
	@BeforeAll
	void init()
	{
		 jagan = new CabDriver(112,"Jagan", 48553998,"Chennai",LocalDate.of(1994,1,10), 3.5);
		 kugan = new CabDriver(113,"Kugan", 48553998,"Tambaram",LocalDate.of(1996,4,10), 2.5);
		 damu= new CabDriver(114,"Damu", 48553998,"Chrompet",LocalDate.of(1998,9,10), 4.5);
		
   	}
	
	@DisplayName("Test find all method return a array")
	@Test
	void testFindAll() throws Exception
	{
		List<CabDriver> list = new ArrayList<>();
			list.add(jagan);
			list.add(kugan);
			list.add(damu);
			
			given(service.findAll()).willReturn(list);
			
			mock.perform(MockMvcRequestBuilders
					.get("/api/v1/drivers")
					.contentType(MediaType.APPLICATION_JSON))
			        .andExpect(status().isOk())
			        .andExpect(jsonPath("$",hasSize(3)))
			        .andExpect(jsonPath("$[2].driverName",is("Damu")));
			        
			        
	}
		
	@Test
	@DisplayName("Test addMethod should return a details")
	void testAdd() throws Exception
	{
		CabDriver angel= new CabDriver(115,"Angel", 48553998,"Chennai",LocalDate.of(1999,8,17), 3.5);
		
		given(service.save(angel)).willReturn(angel);
		
		mock.perform(MockMvcRequestBuilders
                .post("/api/v1/drivers")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(angel)))
		        .andExpect(status().isCreated())
		        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.driverName", is("Angel")));
		
	}

	public static String asJsonString(CabDriver obj) 
	{
		try 
	    {
		 ObjectMapper objectMapper = new ObjectMapper();
		 return objectMapper.writeValueAsString(obj);
		} 
		catch(Exception e) 
		{
			
		  throw new RuntimeException(e);
	    }
	 }
		
	
	@Test
	@DisplayName(value="Test find method shold return the id")
	void testfindById() throws Exception{
		
	Optional<CabDriver> element = Optional.of(damu);
	given(service.findById(114)).willReturn(element);
	
	mock.perform(MockMvcRequestBuilders.get("/api/v1/drivers/114"))
	.andExpect(jsonPath("$.driverName",is("Damu")));
           	  
	}
	
	
	
	@DisplayName("Test deleteById  Method return a deletedelement")
	@Test
	void testDeleteById() throws Exception {

		Optional<CabDriver> element=Optional.of(jagan);
		
		given(service.remove(112)).willReturn(element);
		
		
		mock.perform(MockMvcRequestBuilders
                .delete("/api/v1/drivers/del/112")
               .contentType(MediaType.APPLICATION_JSON))
              // .andExpect(status(204))
               // .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$.driverName", is("Jagan")));
                
	}
	
}


