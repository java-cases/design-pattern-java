package com.designpattern.cases.constructor.abstractfactory.impl;

import com.designpattern.cases.constructor.abstractfactory.ProductB;

public class ProductB1 implements ProductB {

    @Override
    public void doSomething() {
        System.out.println("ProductB1");
    }
}
