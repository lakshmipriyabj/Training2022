package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Component
@FieldDefaults(level= AccessLevel.PRIVATE)

@AllArgsConstructor
               
@Getter
public class CustomerList {
	
	List<Customer> custList;

}
