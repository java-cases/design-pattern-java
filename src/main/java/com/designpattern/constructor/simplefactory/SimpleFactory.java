package com.designpattern.constructor.simplefactory;

import com.designpattern.constructor.model.Product;
import com.designpattern.constructor.model.ProductA;
import com.designpattern.constructor.model.ProductB;
import com.designpattern.constructor.model.ProductC;

public class SimpleFactory {

    private SimpleFactory(){
    }

    public static Product createProduct(ProductType type) {
        if (type == ProductType.A) {
            return new ProductA();
        } else if (type == ProductType.B) {
            return new ProductB();
        }

        return new ProductC();
    }
}
