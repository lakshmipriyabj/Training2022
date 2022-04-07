package com.training.model;

import com.training.services.BankAccountService;
import com.training.services.SavingsAccountService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ramsAccount = new BankAccount(1010, "Ramesh", 5000, "savings");
      System.out.println(ramsAccount);
		
		SavingsAccount account = new SavingsAccount(650, "Ramesh",  678, "joint","Rajesh");
				
				System.out.println(account.getAccountHolderName());
		
		
		   System.out.println(account.getNominee());
		   
		   
		   SavingsAccountService service = new SavingsAccountService();
		   
		System.out.println(service.getCustomerInfo(account));
		
		System.out.println(service.calculateInterest(account)); // substitute 
		
		BankAccountService service2 = new SavingsAccountService(); // supr = sub
		
		
		
		// cannot  access the sub class methood with super class reference
		// service2.getCustomerInfo
		
		SavingsAccountService savingsService2 = (SavingsAccountService)service2; //casting
		
		BankAccountService sc2 = new SavingsAccountService();
		
		
		System.out.println(savingsService2.getCustomerInfo(account));
		
		   
				
	}

}
