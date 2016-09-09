package com.wangdi.designpattern.decorator;

public class ConcreteDecoratorB extends ADecorator {

	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("Operation B");
	}
	
	public void addedBehavior(){
		
	}
}
