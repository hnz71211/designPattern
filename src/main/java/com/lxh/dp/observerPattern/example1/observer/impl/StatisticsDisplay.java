package com.lxh.dp.observerPattern.example1.observer.impl;

import com.lxh.dp.observerPattern.example1.display.DisplayElement;
import com.lxh.dp.observerPattern.example1.observer.Observer;
import com.lxh.dp.observerPattern.example1.subject.impl.WeatherData;

/**
 * @ClassName: StatisticsDisplay
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics: " + temp + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
