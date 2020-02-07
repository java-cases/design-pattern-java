package com.designpattern.gof.creational.factorymethod;

public abstract class Factory {

    public Factory() {
    }

    public Product create() {
        return factoryMethod();
    }

    protected abstract Product factoryMethod();

}