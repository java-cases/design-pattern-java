package com.designpattern.constructor.factorymethod.impl;

import com.designpattern.constructor.factorymethod.Factory;
import com.designpattern.constructor.model.Product;
import com.designpattern.constructor.model.ProductA;

public class FactoryA implements Factory {

    public Product createProduct() {
        return new ProductA();
    }

}
