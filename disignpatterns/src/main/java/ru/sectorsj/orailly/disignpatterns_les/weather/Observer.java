package ru.sectorsj.orailly.disignpatterns_les.weather;

public interface Observer {
	void update(float temp, float humidity, float pressure);
}
