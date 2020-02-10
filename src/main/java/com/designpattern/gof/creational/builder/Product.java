package com.designpattern.gof.creational.builder;

/**
 *
 */
public class Product {

    private Object part1;
    private Object part2;

    public Product() {
    }

    public void setPart1(Object part) {
        this.part1 = part;
    }

    public void setPart2(Object part) {
        this.part1 = part;
    }

    public void operation() {
        System.out.println("Product.operation()");
    }

}