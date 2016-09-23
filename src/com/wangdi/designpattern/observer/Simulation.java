package com.wangdi.designpattern.observer;

public class Simulation {

	public static void main(String[] args) {
		Subject subject1 = new Subject(1);
		Observer observer1 = new Observer();
		Observer observer2 = new Observer();
		
		Subject subject2 = new Subject(2);
		subject1.registerObserver(observer1);
		subject1.registerObserver(observer2);
		subject2.registerObserver(observer1);
		subject2.registerObserver(observer2);
		
		subject1.setMessage("hello");
		subject2.setMessage("change");
	}

}
