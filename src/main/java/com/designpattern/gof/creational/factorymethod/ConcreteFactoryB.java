package com.designpattern.gof.creational.factorymethod;

public class ConcreteFactoryB extends Factory {

    public ConcreteFactoryB() {
    }

    protected Product factoryMethod() {
        return new ConcreteProductB();
    }

}