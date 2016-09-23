package com.wangdi.designpattern.decorator2;

public class CoffeeSmallCup implements ICoffee {
	private String description = "SmallCup";
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}

}
