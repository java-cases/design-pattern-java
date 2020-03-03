package com.designpattern.gof.creational.builder;

/**
 *
 */
public class Director {

    public Director() {
    }

    /**
     * @param builder
     * @return
     */
    public Product construct(Builder builder) {
        return builder.buildPart1("keyboard")
                .buildPart2("mouse")
                .build();
    }

}