package com.training.model;

import javax.management.RuntimeErrorException;

import com.training.exception.RangeCheckException;

public class Student {
	
	private int roolNumber;
	private String firstName;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roolNumber, String firstName, double markScored) throws RangeCheckException {
		super();
		if(markScored<0) {
			
			throw new RangeCheckException("mark should be positive integer[0-100]");
		}else {
		this.roolNumber = roolNumber;
		this.firstName = firstName;
		this.markScored = markScored;
	}
	}
	public int getRoolNumber() {
		return roolNumber;
	}
	public void setRoolNumber(int roolNumber) {
		this.roolNumber = roolNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		if(markScored<0) 
			{
			   try {
				throw new RangeCheckException("mark should be positive integer[0-100]");
			} catch (RangeCheckException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		this.markScored = markScored;
	}
	@Override
	public String toString() {
		return "Student [roolNumber=" + roolNumber + ", firstName=" + firstName + ", markScored=" + markScored + "]";
	}
	
	

}
