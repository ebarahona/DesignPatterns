package com.wangdi.designpattern.decorator2;

public class CoffeeLargeCup implements ICoffee {
	private String description = "LargeCup";
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 15;
	}

}
