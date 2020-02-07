package com.designpattern.cases.behavior.observer.display;

import com.designpattern.cases.behavior.observer.Observer;

public class ConditionsDisplay implements Observer {

    public ConditionsDisplay() {
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("ConditionsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
