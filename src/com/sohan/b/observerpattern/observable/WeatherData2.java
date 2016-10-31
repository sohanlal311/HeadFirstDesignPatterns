package com.sohan.b.observerpattern.observable;

import java.util.Observable;

public class WeatherData2 extends Observable {
	private float temp;
	private float pressure;
	private float humidity;
	private float tempIndex;

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public float getTemp() {
		return temp;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getTempIndex() {
		return tempIndex;
	}

	public void setData(float temp, float pressure, float humidity,
			float tempIndex) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		this.tempIndex = tempIndex;
		measurementsChanged();
	}

}
