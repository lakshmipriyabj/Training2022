package com.training.model;

public class Student implements Comparable<Student> 
{
	private int rollNumber;
	private String FirstName;
	private double markScored;
	
	public Student() {
		super();
		
	}
	public Student(int rollNumber, String firstName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		FirstName = firstName;
		this.markScored = markScored;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", FirstName=" + FirstName + ", markScored=" + markScored + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(markScored);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rollNumber;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (Double.doubleToLongBits(markScored) != Double.doubleToLongBits(other.markScored))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}
	@Override
	public int compareTo(Student otherObj) {
		// TODO Auto-generated method stub
		
		//deccending
	//	return otherObj.FirstName.compareTo(this.FirstName);
		//asscending
		return this.FirstName.compareTo(otherObj.FirstName);
	}
	

}
