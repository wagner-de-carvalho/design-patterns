package com.home;

public class ConsoleObserver implements Observer {

	@Override
	public void update(Subject subject) {
		WeatherForecast wf = (WeatherForecast) subject;
		
		System.out.println("Temperatura: " + wf.getTemperature());
	}
}
