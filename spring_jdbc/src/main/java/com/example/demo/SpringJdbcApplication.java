package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		
	ApplicationContext ctx=	SpringApplication.run(SpringJdbcApplication.class, args);
		
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		repo.findAll().forEach(System.out::println);
		
//		System.out.println("***** One Row Added*****");
		Product tv = ctx.getBean(Product.class);
		System.out.println(tv);
		
		
		
		System.out.println("***********id************");
		System.out.println(repo.findById(8));
		
		System.out.println("_________________update___________");
		System.out.println(repo.update(tv));
				
//				System.out.println("-----------removed__-----");
//		System.out.println(repo.remove(30));
	}
		
		@Bean
		public Product tv()
		{
			return new Product(7,"jmnnhhnmhh",234000);
		}
	    

}
