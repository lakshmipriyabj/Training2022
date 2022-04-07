package com.training.model;

public class SavingsAccount extends BankAccount 
{

	private String nominee;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
		
		
		
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}


	
	
//	0 arg constructor
	// whenever sub class constructor is called its super class constructorALSO called .
	// Even if super() key word is not present 
	
//	public SavingsAccount() {
//		
//		System.out.println("CONSTRUCTOR of SUB CLASS called ");
//		
//	}
	
	
	// 3 arg constructor 
//	
//	public SavingsAccount ()
//	{
//		super(1020,"ram",5000);
//		System.out.println("Constructor of SUB CLASS Called ");
//	}
	

	
}
