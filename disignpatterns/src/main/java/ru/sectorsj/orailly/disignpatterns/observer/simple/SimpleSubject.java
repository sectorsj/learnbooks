package ru.sectorsj.orailly.disignpatterns.observer.simple;

import java.util.*;


public class SimpleSubject implements Subject {
	private List<ru.sectorsj.orailly.disignpatterns.observer.simple.Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<ru.sectorsj.orailly.disignpatterns.observer.simple.Observer>();
	}

	public void registerObserver(ru.sectorsj.orailly.disignpatterns.observer.simple.Observer o) {
		observers.add(o);
	}

	public void removeObserver(ru.sectorsj.orailly.disignpatterns.observer.simple.Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}