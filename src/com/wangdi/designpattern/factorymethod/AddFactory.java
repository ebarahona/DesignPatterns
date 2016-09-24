package com.wangdi.designpattern.factorymethod;

public class AddFactory implements IOperationFactory {

	@Override
	public AbstractOperation createOperation() {
		return new OperationAddition();
	}

}
