package com.designpattern.cases.structure.decorator.drinks;

public class Mocha extends CondimentDecorator {

    public Mocha(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return 1 + drink.cost();
    }
}
