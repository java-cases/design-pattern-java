package com.designpattern.cases.behavior.templateMethod;

public class ChineseTea extends Drink {

    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
