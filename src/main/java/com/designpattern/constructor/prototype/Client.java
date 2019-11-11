package com.designpattern.constructor.prototype;

public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("ab");
        Prototype clone = prototype.clone();

        System.out.println("prototype: " + prototype.toString());
        System.out.println("clone: " + clone.toString());

        prototype.setData("cd");
        System.out.println("prototype: " + prototype.toString());
        System.out.println("clone: " + clone.toString());

        clone.setData("ef");
        System.out.println("prototype: " + prototype.toString());
        System.out.println("clone: " + clone.toString());
    }
}
