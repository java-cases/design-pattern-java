package com.designpattern.cases.constructor.abstractfactory;

import com.designpattern.cases.constructor.abstractfactory.impl.Factory1;
import com.designpattern.cases.constructor.abstractfactory.impl.Factory2;

public class Client {

    public static void main(String[] args){
        useFactory1();
        useFactory2();
    }

    public static void useFactory1() {
        AbstractFactory abstractFactory = new Factory1();

        ProductA productA = abstractFactory.createProductA();
        ProductB productB = abstractFactory.createProductB();
        ProductC productC = abstractFactory.createProductC();

        productA.doSomething();
        productB.doSomething();
        productC.doSomething();
    }

    public static void useFactory2() {
        AbstractFactory abstractFactory = new Factory2();

        ProductA productA = abstractFactory.createProductA();
        ProductB productB = abstractFactory.createProductB();
        ProductC productC = abstractFactory.createProductC();

        productA.doSomething();
        productB.doSomething();
        productC.doSomething();
    }
}
