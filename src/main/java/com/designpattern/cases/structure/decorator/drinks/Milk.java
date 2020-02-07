package com.designpattern.cases.structure.decorator.drinks;

public class Milk extends CondimentDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return 1 + drink.cost();
    }
}
