package com.designpattern.behavior.strategy;

public class Client {

    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        Price price = new Price();

        price.setStrategy(new NormalCustomerStrategy());
        price.calc(1000.0);

        price.setStrategy(new OldCustomerStrategy());
        price.calc(1000.0);

        price.setStrategy(new LargeCustomerStrategy());
        price.calc(1000.0);
    }
}
