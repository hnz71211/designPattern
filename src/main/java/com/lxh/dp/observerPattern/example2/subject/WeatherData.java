package com.lxh.dp.observerPattern.example2.subject;

import java.util.Observable;

/**
 * @ClassName: WeatherData
 * @Description: 使用java.util.Observable
 * Observable是一个类，所有会有一些问题：无法继承其他类，setChanged()为protected，也就是除非继承，否则无法创建实例并组合到自己的对象中。
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        /**
         * 这里没有调用notifyObservers()传送数据对象，这表示我们采用的做法是"拉"
         */
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * get方法，因为要使用"拉"的方法，观察者会利用这些方法取得WeatherData对象的状态
     * @return
     */
    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
