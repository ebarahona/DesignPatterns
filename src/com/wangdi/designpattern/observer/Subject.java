package com.wangdi.designpattern.observer;
import java.util.ArrayList;

public class Subject extends SubjectAbstract{
	private String message;
	private int id;

	private ArrayList<Observer> observerList;

	public Subject(int id) {
		this.id = id;
		observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void deregisterObserver(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void updateAll() {
		for(int i=0; i<observerList.size(); i++){
			observerList.get(i).setId(id);
			observerList.get(i).notification();
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		updateAll();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
