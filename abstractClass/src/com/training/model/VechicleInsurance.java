package com.training.model;

public class VechicleInsurance extends Insurance {

	
	 private String vechicleModel;
	 private int yearOfManufacture;
	 
	@Override
	public double calculatePremium() {
		
		double premium = 1000;
		if(yearOfManufacture<2020  &&  vechicleModel.equals("car"))
		{ 
			premium = 2000;
		}
		
		return premium;
		
	}
	public VechicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VechicleInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}
	
	public VechicleInsurance(int policyNumber, String policyHolderName, String vehicleModel,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vechicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public String getVehicleModel() {
		return vechicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vechicleModel = vehicleModel;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	
}
