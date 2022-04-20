package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student(101,"ram",LocalDate.of(1972, 10, 12),
				LocalDateTime.of(2000,Month.JUNE,5,9,30));
		
		Student shyam = new Student(101,"ram",LocalDate.now(),
				LocalDateTime.now());
		
		System.out.println("Rams year of birth"+ram.getDateOfBirth().getYear());
		System.out.println("Rams First Birthday"+ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));

		System.out.println("Shyam year of birth"+shyam.getDateOfBirth().getYear());
	System.out.println("Shyam Sixtyth Birthday:"+shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));
	System.out.println("Shyam Sixtyth Birthday:"+shyam.getDateOfBirth().minus(2,ChronoUnit.MONTHS));
			}

}
