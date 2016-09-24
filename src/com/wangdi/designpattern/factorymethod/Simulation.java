package com.wangdi.designpattern.factorymethod;

public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOperationFactory operationFactory = new AddFactory();
		AbstractOperation operation = operationFactory.createOperation();
		
		operation.numberA = 10;
		operation.numberB = 5;
		double result = operation.getResult();
		System.out.println(result);
		
		operationFactory = new SubFactory();
		operation = operationFactory.createOperation();
		operation.numberA = 10;
		operation.numberB = 5;
		result = operation.getResult();
		System.out.println(result);

	}

}
