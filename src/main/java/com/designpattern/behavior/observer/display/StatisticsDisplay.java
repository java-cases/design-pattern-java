package com.designpattern.behavior.observer.display;

import com.designpattern.behavior.observer.Observer;

public class StatisticsDisplay implements Observer {

    public StatisticsDisplay() {
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
