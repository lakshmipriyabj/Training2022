package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lap_cab_driver_22")
public class CabDriver {
	
	
	@Id
	@Column(name="driver_id")
	int driverId;
	
	@Column(name="driver_name")
	String driverName;
	
	@Column(name="mobile_number")
	long mobileNumber;
	
	@Column(name="location")
	String location;
	
	@Column(name="date_of_birth")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	
	@Column(name="rating")
	double rating;

}
