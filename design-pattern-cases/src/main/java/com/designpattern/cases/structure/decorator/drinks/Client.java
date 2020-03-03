package com.designpattern.cases.structure.decorator.drinks;

public class Client {

    public static void main(String[] args) {
        Drink drink = new HouseBlend();
        System.out.println(drink.cost()); //3.0

        drink = new Mocha(drink);
        System.out.println(drink.cost()); //4.0

        //本来3元的饮料，加上Mocha、Milk后就变成了5元
        drink = new Milk(drink);
        System.out.println(drink.cost()); //5.0
    }
}
