package com.designpattern.cases.constructor.abstractfactory.impl;

import com.designpattern.cases.constructor.abstractfactory.ProductC;

public class ProductC1 implements ProductC {

    @Override
    public void doSomething() {
        System.out.println("ProductC1");
    }
}
