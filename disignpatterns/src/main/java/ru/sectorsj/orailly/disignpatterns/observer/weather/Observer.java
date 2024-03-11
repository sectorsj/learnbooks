package ru.sectorsj.orailly.disignpatterns.observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
