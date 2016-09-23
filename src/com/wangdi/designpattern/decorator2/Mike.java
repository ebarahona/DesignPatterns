package com.wangdi.designpattern.decorator2;

public class Mike extends Decorator {
	private String description = " add mike";
	
	public Mike(ICoffee beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + description;
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 2.5;
	}
	
}
