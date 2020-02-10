package com.designpattern.gof.creational.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototypeA = new ConcretePrototypeA();
        Prototype objectA = (Prototype) prototypeA.clone();
        objectA.operation();

        System.out.println("prototypeA==objectA? -> " + (prototypeA == objectA));

        Prototype prototypeB = new ConcretePrototypeB();
        Prototype objectB = (Prototype) prototypeB.clone();
        objectB.operation();
    }
}