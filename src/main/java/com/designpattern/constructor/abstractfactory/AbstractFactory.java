package com.designpattern.constructor.abstractfactory;

@SuppressWarnings("ALL")
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
    ProductC createProductC();
}
