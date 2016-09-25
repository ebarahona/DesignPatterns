package com.wangdi.designpattern.prototype;

public class ConcretePrototype extends Prototype {
	private String description;
	
	public ConcretePrototype() {
		
	}
	
	public void setDescription(String des){
		this.description = des;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void show() {
		System.out.println("concrete prototype: " + description);

	}

}
