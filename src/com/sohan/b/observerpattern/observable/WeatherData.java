package com.sohan.b.observerpattern.observable;

import java.util.ArrayList;
import java.util.List;

import com.sohan.b.observerpattern.observers.Observer;

public class WeatherData implements Observable {
	private final List<Observer> observers;
	private float temp;
	private float pressure;
	private float humidity;
	private float tempIndex;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this, null);
		}
	}

	public void measurementsChanged() {
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
