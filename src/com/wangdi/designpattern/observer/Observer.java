package com.wangdi.designpattern.observer;

public class Observer extends ObserverAbstract{
	private int id = -1;
	
	@Override
	public void notification() {
		System.out.println("got it! from id:" + id);
	}

	@Override
	public void setId(int id) {
		this.id = id;
		
	}
	
	
	
}
