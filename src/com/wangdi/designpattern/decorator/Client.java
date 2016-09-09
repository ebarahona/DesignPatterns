package com.wangdi.designpattern.decorator;

public class Client {

	public static void main(String[] args) {
		ConcoreteComponent c = new ConcoreteComponent();
		ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
		ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
		
		decoratorA.setComponent(c);
		decoratorB.setComponent(decoratorA);
		decoratorB.operation();
	}

}
