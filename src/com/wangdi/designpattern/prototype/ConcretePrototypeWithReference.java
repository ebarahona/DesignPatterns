package com.wangdi.designpattern.prototype;

public class ConcretePrototypeWithReference implements Cloneable{
	private Description description;
	
	public ConcretePrototypeWithReference() {
		description = new Description(1);
	}
		
	public void setDescriptionNumber(int des){
		this.description.setDescription(des);
	}
	
	public void show() {
		System.out.println("concrete prototype: " + description.getNumber());
	}

	public Description getDescription() {
		return this.description;
	}
	
	@Override
	protected ConcretePrototypeWithReference clone() throws CloneNotSupportedException {
		Object object = null;
		try {
			object = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (ConcretePrototypeWithReference)object;
	}

	
}
