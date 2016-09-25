package com.wangdi.designpattern.templatemethod;

public class ConcreteTemplateWithDoHook extends AbstractTemplate {

	@Override
	public void doMustMethod() {
		System.out.println("I do another things");
	}

	@Override
	public void doHookMethod() {
		super.doHookMethod();
		System.out.println("I do hook method");
	}

	
}
