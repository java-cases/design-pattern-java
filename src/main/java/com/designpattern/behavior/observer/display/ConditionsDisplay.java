package com.designpattern.behavior.observer.display;

import com.designpattern.behavior.observer.Observer;

public class ConditionsDisplay implements Observer {

    public ConditionsDisplay() {
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("ConditionsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
