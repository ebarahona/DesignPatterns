package com.wangdi.designpattern.templatemethod;

public abstract class AbstractTemplate {
	
	public abstract void doMustMethod();
	
	public void doHookMethod(){};
	
	private final void concreteMenthod() {
		System.out.println("concrete");
	}
	
	/**
	 * call method
	 */
	public void templeMethod(){
		doMustMethod();
		doHookMethod();
		concreteMenthod();
	}
}
