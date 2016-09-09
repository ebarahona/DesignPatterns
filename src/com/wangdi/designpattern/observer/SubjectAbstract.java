package com.wangdi.designpattern.observer;

public abstract class SubjectAbstract {
	public abstract void registerObserver(Observer o);
	public abstract void deregisterObserver(Observer o);
	public abstract void updateAll();
}
