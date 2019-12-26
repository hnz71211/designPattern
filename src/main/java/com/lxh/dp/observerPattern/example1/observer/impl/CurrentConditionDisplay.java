package com.lxh.dp.observerPattern.example1.observer.impl;

import com.lxh.dp.observerPattern.example1.display.DisplayElement;
import com.lxh.dp.observerPattern.example1.observer.Observer;
import com.lxh.dp.observerPattern.example1.subject.impl.WeatherData;

/**
 * @ClassName: CurrentConditionDisplay
 * @Description: 此布告板实现Observer接口，所以可以从WeatherData对象中得到改变；
 *               也实现DisplayElement接口，使用API
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    /**
     * 构造器需要WeatherData对象（主题），作为注册之用
     * @param weatherData
     */
    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temp + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
