package com.designpattern.constructor.abstractfactory.impl;


import com.designpattern.constructor.abstractfactory.ProductA;

public class ProductA1 implements ProductA {

    @Override
    public void doSomething() {
        System.out.println("ProductA1");
    }
}
