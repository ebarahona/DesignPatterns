package com.wangdi.designpattern.factorymethod;

public class OperationAddition extends AbstractOperation {

	@Override
	public double getResult() {
		return numberA + numberB;
	}

}
