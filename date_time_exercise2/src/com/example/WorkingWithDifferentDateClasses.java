package com.example;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;
public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		//step 1 create util date 
		java.util.Date date1 = new java.util.Date(); //for import package 
	//	java.sql.Date date2 = new java.sql.Date(999897);
		 System.out.println(date1);
		 
		// System.out.println(date1.getTime());
		 
		 //step 2 util date to sql date 
		 java.sql.Date date2 = new java.sql.Date(date1.getTime());
		 System.out.println("util"+date2);
		 
		 //step 3 sql date to local date 
		LocalDate localDate = date2.toLocalDate();
		System.out.println("local date:"+localDate);
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		
		//step 4 local date to sql date 
		java.sql.Date sqlDate =  java.sql.Date.valueOf(localDate);
		System.out.println("SQL Date 2:" +sqlDate);
	

	}

}
