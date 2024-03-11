package ru.sectorsj.orailly.disignpatterns_les.weather;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}


