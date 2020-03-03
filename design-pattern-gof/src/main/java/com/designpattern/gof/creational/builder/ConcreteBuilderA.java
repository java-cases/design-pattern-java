package com.designpattern.gof.creational.builder;

/**
 *
 */
public class ConcreteBuilderA implements Builder {

    private Product product;

    public ConcreteBuilderA() {
        this.product = new Product();
    }

    /**
     * @param arg
     * @return
     */
    public Builder buildPart1(Object arg) {
        this.product.setPart1(arg);
        System.out.println("ConcreteBuilderA.buildPart1()");
        return this;
    }

    /**
     * @param arg
     * @return
     */
    public Builder buildPart2(Object arg) {
        this.product.setPart2(arg);
        System.out.println("ConcreteBuilderA.buildPart2()");
        return this;
    }

    /**
     * @return
     */
    public Product build() {
        System.out.println("ConcreteBuilderA.build()");
        return this.product;
    }
}