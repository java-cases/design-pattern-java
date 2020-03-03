package com.designpattern.gof.creational.ext.simplefactory;

public class Factory {

    private Factory() {
    }

    public static Product create(String type) {
        if ("A".equals(type)) {
            return new ConcreteProductA();
        } else if ("B".equals(type)) {
            return new ConcreteProductB();
        }

        return null;
    }

}