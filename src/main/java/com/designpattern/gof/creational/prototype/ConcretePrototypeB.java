package com.designpattern.gof.creational.prototype;

/**
 *
 */
public class ConcretePrototypeB implements Prototype {

    public ConcretePrototypeB() {
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("ConcretePrototypeA.clone()");
        return (ConcretePrototypeB) super.clone();
    }

    public void operation() {
        System.out.println("ConcretePrototypeB.operation()");
    }

}