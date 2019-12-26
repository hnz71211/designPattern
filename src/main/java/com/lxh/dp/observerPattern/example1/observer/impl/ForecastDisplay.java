package com.lxh.dp.observerPattern.example1.observer.impl;

import com.lxh.dp.observerPattern.example1.display.DisplayElement;
import com.lxh.dp.observerPattern.example1.observer.Observer;
import com.lxh.dp.observerPattern.example1.subject.impl.WeatherData;

/**
 * @ClassName: ForecastDisplay
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("forecast...");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}
