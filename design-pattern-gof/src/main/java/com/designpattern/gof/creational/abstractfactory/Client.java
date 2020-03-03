package com.designpattern.gof.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();

        productA.operation();
        productB.operation();
    }

}