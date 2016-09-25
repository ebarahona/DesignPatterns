package com.wangdi.designpattern.prototype;

public class ConcretePrototype2 implements Cloneable {
	private String description;
	
	public void setDescription(String des){
		this.description = des;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void show() {
		System.out.println("concrete prototype: " + description);

	}

	@Override
	protected ConcretePrototype2 clone() throws CloneNotSupportedException {
		return (ConcretePrototype2)super.clone();
	}
	
	
}
