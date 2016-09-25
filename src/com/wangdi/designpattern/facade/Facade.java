package com.wangdi.designpattern.facade;

public class Facade {
	private Subsystem1 subsystem1;
	private Subsystem2 subsystem2;
	private Subsystem3 subsystem3;
	
	public Facade() {
		subsystem1 = new Subsystem1();
		subsystem2 = new Subsystem2();
		subsystem3 = new Subsystem3();
	}
	
	public void methodA(){
		subsystem1.methodOne();
		subsystem2.methodTwo();
	}
	
	public void methodB() {
		subsystem3.methodThree();
	}
	
	public void methodC() {
		subsystem1.methodOne();
		subsystem3.methodThree();
		subsystem2.methodTwo();
	}
}
