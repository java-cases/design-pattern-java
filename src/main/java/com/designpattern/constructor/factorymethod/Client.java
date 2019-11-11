package com.designpattern.constructor.factorymethod;

import com.designpattern.constructor.factorymethod.impl.FactoryA;
import com.designpattern.constructor.factorymethod.impl.FactoryB;
import com.designpattern.constructor.factorymethod.impl.FactoryC;
import com.designpattern.constructor.model.Product;

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
