package com.wangdi.designpattern.templatemethod;

public class Client {

	public static void main(String[] args) {
		AbstractTemplate ct = new ConcreteTemplate();
		ct.templeMethod();
		
		System.out.println("----------------------");

		AbstractTemplate ct2 = new ConcreteTemplateWithDoHook();
		ct2.templeMethod();
	}

}
