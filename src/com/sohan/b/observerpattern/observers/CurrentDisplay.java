package com.sohan.b.observerpattern.observers;

import com.sohan.b.observerpattern.observable.Observable;
import com.sohan.b.observerpattern.observable.WeatherData;

public class CurrentDisplay implements Observer, Display {
	private float temp;
	private float pressure;
	private float humidity;

	public CurrentDisplay(Observable obv) {
		obv.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(CurrentDisplay.class + ": temp: " + this.temp
				+ ", pressure: " + this.pressure + ", humidity: "
				+ this.humidity);
	}

	@Override
	public void update(Observable obv, Object obj) {
		if (obj == null && obv instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obv;
			this.temp = weatherData.getTemp();
			this.pressure = weatherData.getPressure();
			this.humidity = weatherData.getHumidity();
		}
		display();
	}

}
