package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
	String dateOfBirth = "1999-08-10";
	Student vickey = new Student();
	vickey.setRollNumber(200);
	vickey.setStudentName("Vignesh");
    vickey.setDateOfBirth(LocalDate.parse(dateOfBirth));
    vickey.setDateOfJoining(LocalDateTime.now());
    
    System.out.println("Year:"+vickey.getDateOfBirth().getYear());
    System.out.println("Month:"+vickey.getDateOfBirth().getMonth());
    System.out.println("Day:"+vickey.getDateOfBirth().getDayOfMonth());
    
    LocalTime startTime = LocalTime.of(9, 30);
    LocalTime endTime = startTime.plus(8,ChronoUnit.HOURS);
    System.out.println("Start Time:"+startTime);
    System.out.println("Start Time:"+endTime);
	}
}