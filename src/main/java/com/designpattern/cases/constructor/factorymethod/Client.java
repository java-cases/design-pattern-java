package com.designpattern.cases.constructor.factorymethod;

import com.designpattern.cases.constructor.factorymethod.impl.FactoryA;
import com.designpattern.cases.constructor.factorymethod.impl.FactoryB;
import com.designpattern.cases.constructor.factorymethod.impl.FactoryC;
import com.designpattern.cases.constructor.model.Product;

public class Client {

    public static void main(String[] args){
        Product product=new FactoryA().createProduct();
        product.doSomething();

        product=new FactoryB().createProduct();
        product.doSomething();

        product=new FactoryC().createProduct();
        product.doSomething();
    }


    public static void useProduct() {
        Factory factory=new FactoryA();
        factory.doSomething();
    }
}
