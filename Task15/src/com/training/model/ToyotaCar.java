package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "ash";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Camry";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 2000000;
	}

}
