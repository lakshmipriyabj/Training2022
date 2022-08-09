package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

/**
 * @author LakshmiPriya.J
 *
 */
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> findAll()
	{
		return repo.findAll();
	}
	
	public Product add(Product entity)
	{
		return repo.save(entity);
	}
}
