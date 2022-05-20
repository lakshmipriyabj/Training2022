package com.example.demo.entity.ifaces;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

//	@Query(value="from Passenger where passengername=:srchValue")
	List<Passenger> findByPassangerName(String srchname);
//	
//	@Query(value="from triphistory where LocalDateTime=:date")
	List<Passenger> findByTripHistoryListTripDateTime(LocalDateTime date);
//	
	
}
