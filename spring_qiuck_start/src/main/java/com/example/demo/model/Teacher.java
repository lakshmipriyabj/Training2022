package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE) //private
@Data //getter setter
@AllArgsConstructor //with constructor
@NoArgsConstructor //0 arg constructor 

@Component("stella")
public class Teacher {
	
	int id;
	String name;
	String subject;
	

}
