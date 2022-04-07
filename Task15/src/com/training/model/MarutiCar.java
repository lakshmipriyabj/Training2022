package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Baleno";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000;
	}

}
