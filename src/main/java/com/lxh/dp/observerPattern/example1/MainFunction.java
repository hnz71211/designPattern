package com.lxh.dp.observerPattern.example1;

import com.lxh.dp.observerPattern.example1.observer.impl.CurrentConditionDisplay;
import com.lxh.dp.observerPattern.example1.observer.impl.ForecastDisplay;
import com.lxh.dp.observerPattern.example1.observer.impl.StatisticsDisplay;
import com.lxh.dp.observerPattern.example1.subject.impl.WeatherData;

/**
 * @ClassName: MainFunction
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class MainFunction {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurements(90, 35, 26.4f);
    }

}
