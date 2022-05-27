package com.training.service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.entity.Country;
import com.example.ifaces.CrudRepository;

public class CountryService implements CrudRepository {

	
private List<Country> countryList=new ArrayList<>();
	

	
@Override
		public boolean add(Country country) {
			// TODO Auto-generated method stub
			return this.countryList.add(country);
		}





		@Override
		public List<Country> findall() {
			// TODO Auto-generated method stub
			return this.countryList;
		}



		
		@Override
		public List<String> findplacefromcountry(List<Country> list, String country) {
			
			return this.countryList.stream().filter(e -> e.getCountry().equalsIgnoreCase(country))
					            .map(e -> e.getPlace()).collect(Collectors.toList());
					
					                        
		}
		
}
