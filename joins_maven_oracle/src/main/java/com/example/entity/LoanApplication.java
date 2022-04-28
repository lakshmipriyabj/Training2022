package com.example.entity;

public class LoanApplication {
	private int applicationNumber;
	private Customer customer_id_ref;
	private double loanAmount;
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanApplication(int applicationNumber, Customer customer_id_ref, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.customer_id_ref = customer_id_ref;
		this.loanAmount = loanAmount;
	}
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public Customer getCustomer_id_ref() {
		return customer_id_ref;
	}
	public void setCustomer_id_ref(Customer customer_id_ref) {
		this.customer_id_ref = customer_id_ref;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", customer_id_ref=" + customer_id_ref
				+ ", loanAmount=" + loanAmount + "]";
	}
	
}