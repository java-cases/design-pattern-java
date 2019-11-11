package com.designpattern.behavior.templateMethod;

public class Client {

    public static void main(String[] args) {
        prepare();
    }

    public static void prepare() {
        Drink drink = new Coffee();
        drink.prepare();

        System.out.println("-----------");

        drink = new ChineseTea();
        drink.prepare();
    }

}
