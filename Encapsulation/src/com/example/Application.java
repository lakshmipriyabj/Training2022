package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
    
    
    
 //   ram.setRollNumber(1234);
    
   // ram.rollnumber = 101;
    // public method able to access
    //private
    
    //default method unable to access=>
    // because student class is in com.example.model package
    //and application is in com.example  package
    
    //  System.out.println(ram.getRollNumber());
    
   // ram.setFirstName("ram"); //default
    
  //  ram.setMarkScored(90); //protected
    
//    ram.setBranch("be");//public
    // unable to access because application is NOT a subclass 
    Student ram = new Student();
    
    System.out.println("Roll Number :=" +ram.getRollNumber());
    
    System.out.println("Mark Scored :=" +ram.getMarkScored());
    
    System.out.println("Student Name :=" +ram.getFirstName());
    
    System.out.println("Branch:=" +ram.getBranch());
    
  
    
    Student sathya = new Student(490, "sathya", 89, "mech");
    
    System.out.println("Roll Number:=" +sathya.getRollNumber());
    
    System.out.println("Student Name:=" +sathya.getFirstName());
    
    Student magesh = new Student(988, "Subramani","textile");
    
    
    System.out.println("Roll Number:=" +magesh.getRollNumber());
    
    System.out.println("Student Mark:=" +magesh.getMarkScored());
		
	}

}
