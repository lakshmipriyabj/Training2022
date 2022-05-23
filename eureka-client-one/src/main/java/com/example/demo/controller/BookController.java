package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	@Value("${server.port}") //for the port value
	private String port;
	
	
	@GetMapping(path="/books")
	public List<String> getBooks(){
		
		return Arrays.asList("Head First java","spring in action","thinking in java");
	}
	
	@GetMapping(path="/books/{id}")
	public String getBookById(@PathVariable int id)
		{
			if(id==1)
			{
				return "head first java:="+port;  //add the port
			}else {
				return "spring in action:="+port;
			}
		}
	}



