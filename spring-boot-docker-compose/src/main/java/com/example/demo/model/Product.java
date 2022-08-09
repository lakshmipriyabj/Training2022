package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
@Table(name="product")
public class Product {
	
	
	@Id
	@Column(name="product_id")
	int productId;
	
	@Column(name="product_name")
	String productName;
	
	@Column(name="rate")
	double rate;

}
