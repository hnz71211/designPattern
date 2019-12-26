package com.lxh.dp.observerPattern.example1.subject.impl;

import com.lxh.dp.observerPattern.example1.observer.Observer;
import com.lxh.dp.observerPattern.example1.subject.Subject;

import java.util.ArrayList;

/**
 * @ClassName: WeatherData
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    /**
     * 当气象站得到更新观测值时，通知观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
