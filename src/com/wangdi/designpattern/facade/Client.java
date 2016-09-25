package com.wangdi.designpattern.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		
		System.out.println("-------------------");
		facade.methodB();
		
		System.out.println("-------------------");
		facade.methodC();
		
	}

}
