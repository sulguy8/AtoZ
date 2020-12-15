package designPattern.behavioral.observer.hf.exercise1;

import designPattern.behavioral.observer.hf.exercise1.display.impl.CurrentConditionsDisplay;
import designPattern.behavioral.observer.hf.exercise1.subject.impl.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay3 = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.4f);
		
		
	}
}
