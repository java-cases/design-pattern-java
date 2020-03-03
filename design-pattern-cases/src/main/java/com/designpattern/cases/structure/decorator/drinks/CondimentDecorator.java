package com.designpattern.cases.structure.decorator.drinks;

public abstract class CondimentDecorator implements Drink {
    protected Drink drink;

    public CondimentDecorator(Drink drink) {
        this.drink = drink;
    }
}
