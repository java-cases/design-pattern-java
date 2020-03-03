package com.designpattern.cases.constructor.factorymethod.impl;

import com.designpattern.cases.constructor.factorymethod.Factory;
import com.designpattern.cases.constructor.model.Product;
import com.designpattern.cases.constructor.model.ProductB;

public class FactoryB implements Factory {

    public Product createProduct() {
        return new ProductB();
    }

}
