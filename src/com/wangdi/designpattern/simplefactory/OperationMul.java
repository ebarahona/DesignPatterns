package com.wangdi.designpattern.simplefactory;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = numberA * numberB;
		
		return result;
	}

}
