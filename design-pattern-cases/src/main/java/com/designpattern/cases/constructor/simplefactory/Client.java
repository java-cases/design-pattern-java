package com.designpattern.cases.constructor.simplefactory;

public class Client {

    public static void main(String[] args) {
        SimpleFactory.createProduct(ProductType.A).doSomething();
    }
}
