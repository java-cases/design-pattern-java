package com.designpattern.cases.constructor.factorymethod;

import com.designpattern.cases.constructor.model.Product;

public interface Factory {

    Product createProduct();

    default void doSomething() {
        Product product = createProduct();
        product.doSomething();
    }
}
