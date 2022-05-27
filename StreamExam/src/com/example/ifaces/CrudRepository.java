package com.example.ifaces;

import java.util.List;

import com.example.entity.Country;

public interface CrudRepository {
	
	public boolean add(Country country);
	public List<String> findplacefromcountry(List<Country> list ,String country);
     
	public List<Country> findall();

	
	

}



