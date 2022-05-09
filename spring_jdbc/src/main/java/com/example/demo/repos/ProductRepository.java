package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

@Repository
public class ProductRepository implements CrudRepository<Product>{
	
	private JdbcTemplate template;  
	
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t) {
	String sql = "insert into lp_product values(?,?,?)";
		return  template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
	}

	@Override
	public List<Product> findAll() {
		
		String sql = "select * from lp_product";


		return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public int remove(int id) {
		
		String sql="delete from lp_product where product_id=?";
				return template.update(sql,id);
	
	}

	@Override
	public Product findById(int id) {
		try {
		String sql = "select * from lp_product where product_id=?";
		
		return template.queryForObject(sql,BeanPropertyRowMapper.newInstance(Product.class),id);
	}catch(IncorrectResultSizeDataAccessException e)
		{
		 return null;
		}
	}
	
	@Override
	public int update(Product t) {
		
		String sql = "update lp_product set product_Name=? where product_id=?";
		return template.update(sql,new Object[] {t.getProductName(),t.getProductId()});
		
	}
	
}
