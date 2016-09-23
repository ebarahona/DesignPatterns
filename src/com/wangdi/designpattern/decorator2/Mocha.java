package com.wangdi.designpattern.decorator2;

public class Mocha extends Decorator {
	private String description = " add Mocha";

	public Mocha(ICoffee beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + description;
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 5;
	}

}
