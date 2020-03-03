package com.designpattern.cases.behavior.templateMethod;

public class Coffee extends Drink {

    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
