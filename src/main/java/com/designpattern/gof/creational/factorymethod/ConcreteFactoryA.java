package com.designpattern.gof.creational.factorymethod;

public class ConcreteFactoryA extends Factory {

    public ConcreteFactoryA() {
    }

    @Override
    protected Product factoryMethod() {
        return new ConcreteProductA();
    }

}