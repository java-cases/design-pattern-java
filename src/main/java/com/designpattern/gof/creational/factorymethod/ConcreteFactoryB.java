package com.designpattern.gof.creational.factorymethod;

public class ConcreteFactoryB extends Factory {

    public ConcreteFactoryB() {
    }

    protected Product factoryMethod() {
        System.out.println("ConcreteFactoryB.factoryMethod()");
        return new ConcreteProductB();
    }

}