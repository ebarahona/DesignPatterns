package com.wangdi.designpattern.decorator2;

public class Latte extends Decorator {
	private String description = " add Latte";
		
	public Latte(ICoffee beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + description;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 7;
	}

}
