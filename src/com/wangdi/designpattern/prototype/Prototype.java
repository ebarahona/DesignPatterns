package com.wangdi.designpattern.prototype;

public class Prototype implements Cloneable {

	@Override
	public Object clone() {
		Prototype prototype = null;
		try{
			prototype = (Prototype)super.clone();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return prototype;
	}
	
}
