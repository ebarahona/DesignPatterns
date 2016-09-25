package com.wangdi.designpattern.prototype;

public class ConcretePrototypeWithReferenceDeepClone implements Cloneable {
private Description description;
	
	public ConcretePrototypeWithReferenceDeepClone() {
		this.description = new Description(100);
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
	protected ConcretePrototypeWithReferenceDeepClone clone() throws CloneNotSupportedException {
		ConcretePrototypeWithReferenceDeepClone object = null;
		try {
			object = (ConcretePrototypeWithReferenceDeepClone)super.clone();
			object.description = new Description(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (ConcretePrototypeWithReferenceDeepClone)object;
	}

}
