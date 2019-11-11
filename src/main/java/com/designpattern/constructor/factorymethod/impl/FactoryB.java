package com.designpattern.constructor.factorymethod.impl;

import com.designpattern.constructor.factorymethod.Factory;
import com.designpattern.constructor.model.Product;
import com.designpattern.constructor.model.ProductB;

public class FactoryB implements Factory {

    public Product createProduct() {
        return new ProductB();
    }

}
