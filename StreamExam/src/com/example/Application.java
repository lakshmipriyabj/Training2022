package com.example;


import java.util.List;

import com.example.entity.Country;

import com.training.service.CountryService;

public class Application {
	
	public static void print(List<Country> country) {
//		for(Book eachBook:books) {
//			System.out.println(eachBook);
//		}
		country.forEach(System.out::println);
	}

	public static void main(String[] args) {
		
	
		
		Country usa = new Country("USA","Kansas City",5766858);
        Country india = new Country("India","Chennai",867656453);
        Country usa2 = new Country("USA","Los Angeles",89765688);
        Country nepal = new Country("Nepal","kathmandu",78877);
        Country india2 = new Country("India","Kolkata",867656453);
        Country usa3 = new Country("USA","Denver",576685);
        
        CountryService service = new CountryService();
        
        System.out.println(service.add(usa));
        System.out.println(service.add(india));
        System.out.println(service.add(usa2));
        System.out.println(service.add(nepal));
        System.out.println(service.add(india2));
        System.out.println(service.add(usa3));
        
        List<Country> countrylist = service.findall();
		
		print(countrylist);
		
		
		service.findplacefromcountry(countrylist, "india").forEach(System.out::println);
		
		//System.out.println(service.findplacefromcountry(countrylist, "india"));
	}
}
