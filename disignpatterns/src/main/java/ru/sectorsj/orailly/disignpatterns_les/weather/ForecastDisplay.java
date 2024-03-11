package ru.sectorsj.orailly.disignpatterns_les.weather;

public class ForecastDisplay implements Observer, DisplayElement{
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
	}
	
	@Override
	public void display() {
		System.out.print("Прогноз: ");
		if (currentPressure > lastPressure) {
			System.out.println("Ожидается улучшение погодных условий");
		} else if (currentPressure == lastPressure) {
			System.out.println("Погодные условия такие же");
		} else if (currentPressure < lastPressure) {
			System.out.println("Ожидается ухудшение погоды, ветренно, возможны осадки");
		}
	}
}
