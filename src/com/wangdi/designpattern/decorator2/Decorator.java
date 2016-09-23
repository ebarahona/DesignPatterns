package com.wangdi.designpattern.decorator2;

public class Decorator implements ICoffee {
	protected ICoffee beverage;
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return beverage.getPrice();
	}

}
