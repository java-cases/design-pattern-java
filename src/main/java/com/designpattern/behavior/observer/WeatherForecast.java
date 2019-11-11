package com.designpattern.behavior.observer;

import com.designpattern.behavior.observer.display.ConditionsDisplay;
import com.designpattern.behavior.observer.display.StatisticsDisplay;

public class WeatherForecast {

    public static void main(String[] args) {
        observe();
    }

    public static void observe() {
        WeatherData weatherData=new WeatherData();
        weatherData.registerObserver(new StatisticsDisplay());
        weatherData.registerObserver(new ConditionsDisplay());

        weatherData.update(0.0f,0.0f,0.0f);
        weatherData.update(1.0f,1.0f,1.0f);
    }
}
