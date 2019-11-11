package com.designpattern.constructor.abstractfactory.impl;


import com.designpattern.constructor.abstractfactory.AbstractFactory;
import com.designpattern.constructor.abstractfactory.ProductA;
import com.designpattern.constructor.abstractfactory.ProductB;
import com.designpattern.constructor.abstractfactory.ProductC;

public class Factory2 implements AbstractFactory {


    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }

    @Override
    public ProductC createProductC() {
        return new ProductC2();
    }
}
