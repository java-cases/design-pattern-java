package com.designpattern.gof.creational.abstractfactory;

/**
 *
 */
public class ConcreteFactory2 extends AbstractFactory {

    public ConcreteFactory2() {
    }

    /**
     * @return
     */
    public ProductA createProductA() {
        System.out.println("ConcreteFactory2.createProductA()");
        return new ConcreteProductA2();
    }

    /**
     * @return
     */
    public ProductB createProductB() {
        System.out.println("ConcreteFactory2.createProductB()");
        return new ConcreteProductB2();
    }

}