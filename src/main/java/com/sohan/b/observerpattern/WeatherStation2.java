package com.sohan.b.observerpattern;

import java.util.Observer;

import com.sohan.b.observerpattern.observable.WeatherData2;
import com.sohan.b.observerpattern.observers.CurrentDisplay2;
import com.sohan.b.observerpattern.observers.ForecastDisplay2;

public class WeatherStation2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData2 weatherData = new WeatherData2();
		Observer obr1 = new CurrentDisplay2(weatherData);
		Observer obr2 = new ForecastDisplay2(weatherData);
		weatherData.setData(38, 1, 23, (float) 0.20);
	}

}
