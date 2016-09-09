package com.wangdi.designpattern.decorator;

public class ConcreteDecoratorA extends ADecorator{

	private String addState;
	
	@Override
	public void operation() {
		super.operation();
		addState = "new state";
		System.out.println("operation A");
	}

	
}
