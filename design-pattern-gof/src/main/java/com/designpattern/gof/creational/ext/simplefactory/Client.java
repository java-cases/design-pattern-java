package com.designpattern.gof.creational.ext.simplefactory;

public class Client {

    public static void main(String[] args) {
        Product productA = Factory.create("A");
        productA.operation();

        Product productB = Factory.create("B");
        productB.operation();
    }
}