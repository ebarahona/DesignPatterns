package com.wangdi.designpattern.simplefactory;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		double result = 0;

		try {
			result = numberA / numberB;
		} catch (Exception e) {
			System.out.print("Operation B cannot equal 0");
		}

		return result;
	}

}
