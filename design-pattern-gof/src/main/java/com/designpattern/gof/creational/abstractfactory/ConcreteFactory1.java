package com.designpattern.gof.creational.abstractfactory;

/**
 *
 */
public class ConcreteFactory1 extends AbstractFactory {

    public ConcreteFactory1() {
    }

    /**
     * @return
     */
    public ProductA createProductA() {
        System.out.println("ConcreteFactory1.createProductA()");
        return new ConcreteProductA1();
    }

    /**
     * @return
     */
    public ProductB createProductB() {
        System.out.println("ConcreteFactory1.createProductB()");
        return new ConcreteProductB1();
    }

}