package com.wangdi.designpattern.templatemethod;

public class ConcreteTemplate extends AbstractTemplate {

	@Override
	public void doMustMethod() {
		System.out.println("I do it!");
	}

}
