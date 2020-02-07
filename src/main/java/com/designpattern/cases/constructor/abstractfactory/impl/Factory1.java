package com.designpattern.cases.constructor.abstractfactory.impl;


import com.designpattern.cases.constructor.abstractfactory.AbstractFactory;
import com.designpattern.cases.constructor.abstractfactory.ProductA;
import com.designpattern.cases.constructor.abstractfactory.ProductB;
import com.designpattern.cases.constructor.abstractfactory.ProductC;

public class Factory1 implements AbstractFactory {


    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }

    @Override
    public ProductC createProductC() {
        return new ProductC1();
    }
}
