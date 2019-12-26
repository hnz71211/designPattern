package com.lxh.dp.observerPattern.example2.observer;

import com.lxh.dp.observerPattern.example2.display.DisplayElement;
import com.lxh.dp.observerPattern.example2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: CurrentConditionDisplay
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temp + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
