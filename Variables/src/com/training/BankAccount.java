package com.training;

public class BankAccount {
  ///static variable
	private static int count;
	
	//instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	
	//static method
	
	public static int getCount() {
		return ++count;
	}
	
	//instant method
	
  public double getUpdatedBalance(double amount)//parameter variable
   {
	//local variable
	double updatedBalance;
	//local variable
	double currentBalance = 0;
	// local variable should be initialized before using
	//System.out.println(updatedBalance);
	/*currentBalance = this.balance+ amount;
	this.balance=currentBalance; //
	
	return currentBalance;*/
	
	this.balance = this.balance+amount;
	return this.balance;
	}
  
  public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BankAccount(String accountHolderName, double balance, int accountNumber) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		
	}
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
	}

	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = getCount();
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



}

