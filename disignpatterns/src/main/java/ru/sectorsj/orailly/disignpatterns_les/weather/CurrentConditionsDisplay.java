package ru.sectorsj.orailly.disignpatterns_les.weather;


public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Текущие параметры: " + temperature
				+ "F градусов по фаренгейту, и " + humidity + "% влажности");
	}
}
