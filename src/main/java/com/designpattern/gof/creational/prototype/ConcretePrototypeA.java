package com.designpattern.gof.creational.prototype;

/**
 *
 */
public class ConcretePrototypeA implements Prototype {

    public ConcretePrototypeA() {
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("ConcretePrototypeA.clone()");
        return (ConcretePrototypeA) super.clone();
    }

    public void operation() {
        System.out.println("ConcretePrototypeA.operation()");
    }

}