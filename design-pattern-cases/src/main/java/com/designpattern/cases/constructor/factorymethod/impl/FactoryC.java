package com.designpattern.cases.constructor.factorymethod.impl;

import com.designpattern.cases.constructor.factorymethod.Factory;
import com.designpattern.cases.constructor.model.Product;
import com.designpattern.cases.constructor.model.ProductC;

public class FactoryC implements Factory {

    public Product createProduct() {
        return new ProductC();
    }

}
