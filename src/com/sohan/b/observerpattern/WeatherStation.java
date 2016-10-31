package com.sohan.b.observerpattern;

import com.sohan.b.observerpattern.observable.Observable;
import com.sohan.b.observerpattern.observable.WeatherData;
import com.sohan.b.observerpattern.observers.CurrentDisplay;
import com.sohan.b.observerpattern.observers.ForecastDisplay;
import com.sohan.b.observerpattern.observers.Observer;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Observable weatherData = new WeatherData();
		Observer obr1 = new CurrentDisplay(weatherData);
		Observer obr2 = new ForecastDisplay(weatherData);
		((WeatherData) weatherData).setData(38, 1, 23, (float) 0.20);
	}

}
