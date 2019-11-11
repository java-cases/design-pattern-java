package com.designpattern.constructor.factorymethod;

import com.designpattern.constructor.model.Product;

public interface Factory {

    Product createProduct();

    default void doSomething() {
        Product product = createProduct();
        product.doSomething();
    }
}
