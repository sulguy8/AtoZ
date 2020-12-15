package designPattern.behavioral.observer.hf.exercise2;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay3 = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(8033, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.4f);
		
		
		
	}
}
