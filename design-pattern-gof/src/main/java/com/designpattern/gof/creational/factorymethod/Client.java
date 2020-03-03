package com.designpattern.gof.creational.factorymethod;

public class Client {

    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.create();
        productA.operation();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.create();
        productB.operation();
    }
}