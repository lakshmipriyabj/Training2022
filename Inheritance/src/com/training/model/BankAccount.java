package com.training.model;

public class BankAccount {

	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	private String accountType;
	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("ZERO Arg constructor of SUPER CLASS CALLED");
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		System.out.println("THREE Arg constructor of SUPER CLASS CALLED");
		
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		
		System.out.println("FOUR Arg constructor of SUPER CLASS CALLED");
	}
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		
		return accountType;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + this.accountNumber + "," + this.accountHolderName +"," +this.balance+ "," +this.accountType;
	}
}
