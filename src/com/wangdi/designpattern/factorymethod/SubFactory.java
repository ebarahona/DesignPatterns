package com.wangdi.designpattern.factorymethod;

public class SubFactory implements IOperationFactory {

	@Override
	public AbstractOperation createOperation() {
		// TODO Auto-generated method stub
		return new OperationSubtraction();
	}

}
