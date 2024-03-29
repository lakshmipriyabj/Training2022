package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
//	@Autowired
//	@Qualifier("tv")
//	private Product tv;
//	
//	@Autowired
//	@Qualifier("printer")
//	private Product printer;
//	
	@Autowired
	private ProductService service;
	
//	@GetMapping(path = "/products/{id}")
//	public Product getProduct(@PathVariable("id") int id)
//	{
//		return id==102?tv:printer;
//	}
//	
	@GetMapping(path = "/products/findall")
	public List<Product> findAll()
	{
		return service.findAll();
	}
	@PostMapping(path = "/products/add")
	public ResponseEntity<Product> add(@RequestBody Product entity)
	{
		Product added=service.add(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(added);
	}

}
