package com.designpattern.cases.constructor.abstractfactory.impl;


import com.designpattern.cases.constructor.abstractfactory.ProductA;

public class ProductA1 implements ProductA {

    @Override
    public void doSomething() {
        System.out.println("ProductA1");
    }
}
