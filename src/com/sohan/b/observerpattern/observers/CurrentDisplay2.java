package com.sohan.b.observerpattern.observers;

import java.util.Observable;

import com.sohan.b.observerpattern.observable.WeatherData2;

public class CurrentDisplay2 implements java.util.Observer, Display {
	private java.util.Observable obv;
	private float temp;
	private float pressure;
	private float humidity;

	public CurrentDisplay2(Observable obv) {
		this.obv = obv;
		this.obv.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(CurrentDisplay2.class + ": temp: " + this.temp
				+ ", pressure: " + this.pressure + ", humidity: "
				+ this.humidity);
	}

	@Override
	public void update(java.util.Observable obv, Object arg) {
		if (arg == null && obv instanceof WeatherData2) {
			WeatherData2 weatherData = (WeatherData2) obv;
			this.temp = weatherData.getTemp();
			this.pressure = weatherData.getPressure();
			this.humidity = weatherData.getHumidity();
		}
		display();
	}

}
