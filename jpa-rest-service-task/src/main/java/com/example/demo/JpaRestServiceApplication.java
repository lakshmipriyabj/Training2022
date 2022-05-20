package com.example.demo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.entity.ifaces.PassengerRepository;


@SpringBootApplication
public class JpaRestServiceApplication {

	public static void main(String[] args) {
	 	SpringApplication.run(JpaRestServiceApplication.class, args);
	    
	}

	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			
			@Autowired
			PassengerRepository repo;
			@Override
			public void run(String... args) throws Exception {
			    
				
				TripHistory trip1 = new TripHistory(11,LocalDateTime.of(2020,Month.JANUARY,19,2,30),"chennai","bangalore",4000);
				TripHistory trip2 = new TripHistory(12,LocalDateTime.of(2021,Month.MARCH,1,3,40),"bangalore","chennai",4000);
				TripHistory trip3 = new TripHistory(13,LocalDateTime.of(2022,Month.JULY,9,9,30),"avadi","ooty",4000);
				
				List<TripHistory> list = new ArrayList<TripHistory>();
				list.add(trip1);
				list.add(trip2);
				list.add(trip3);
				Passenger maha = new Passenger(101,"maha","chennai","maha@jsf",list);
			    repo.save(maha);
				
			}
		};
}
}
