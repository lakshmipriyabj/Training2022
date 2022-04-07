package com.training.model;

public class HealthInsurance extends Insurance {
	
	private String[] preExistingDiseases;
	
	

	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}



	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}



	public String[] getPreExistingDiseases() {
		return preExistingDiseases;
	}



	public void setPreExistingDiseases(String[] preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}



//	@Override
//	public double calculatePremium() {
//		// TODO Auto-generated method stub
//		double premium = 1000;
//		
//		for(String eachItem : preExistingDiseases)
//		{
//			String item = eachItem.toLowerCase();
//		
//			if(eachItem.equals("BP") || eachItem.equals("sugar")) 
//			{
//				premium = 1500;
//				
//			}
//		}
//		
//		return premium;
//		

@Override
	public double calculatePremium() {
	// TODO Auto-generated method stub
		double premium = 10000;
	
		for(String eachItem : preExistingDiseases)
		{
			String item = eachItem.toLowerCase();
		
			if(eachItem.equalsIgnoreCase("BP") || eachItem.equalsIgnoreCase("sugar")) 
			{
				premium = 15000;
				
			}
			
			}
		return premium;
	
	}

}
