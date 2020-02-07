package com.designpattern.cases.constructor.simplefactory;

import com.designpattern.cases.constructor.model.Product;
import com.designpattern.cases.constructor.model.ProductA;
import com.designpattern.cases.constructor.model.ProductB;
import com.designpattern.cases.constructor.model.ProductC;

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
