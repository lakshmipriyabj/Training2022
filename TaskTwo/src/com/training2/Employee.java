package com.training2;

public class Employee {
	
	private String name;
	private String id;
	private int mobile_Num;
	private int salary;
	private String emailId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMobile_Num() {
		return mobile_Num;
	}
	public void setMobile_Num(int mobile_Num) {
		this.mobile_Num = mobile_Num;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String id, int mobile_Num, int salary, String emailId) {
		super();
		this.name = name;
		this.id = id;
		this.mobile_Num = mobile_Num;
		this.salary = salary;
		this.emailId = emailId;
	}
	
	
	
	
	
}
