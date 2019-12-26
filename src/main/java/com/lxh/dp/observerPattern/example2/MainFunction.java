package com.lxh.dp.observerPattern.example2;

import com.lxh.dp.observerPattern.example2.observer.CurrentConditionDisplay;
import com.lxh.dp.observerPattern.example2.subject.WeatherData;

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

        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.deleteObserver(currentConditionDisplay);

        weatherData.setMeasurements(90, 35, 26.4f);

        System.out.println("---------end------------");
    }

}
