package com.designpattern.gof.creational.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        Product product = director.construct(new ConcreteBuilderA());
        product.operation();

        product = director.construct(new ConcreteBuilderB());
        product.operation();
    }

}