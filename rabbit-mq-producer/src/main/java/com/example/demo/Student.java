package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {
	
	private int id;
	private String name;
	private int mark;
	
	
	

}
