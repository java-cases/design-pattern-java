package com.designpattern.gof.creational.builder;

/**
 *
 */
public interface Builder {

    /**
     * @param arg
     * @return
     */
    Builder buildPart1(Object arg);

    /**
     * @param arg
     * @return
     */
    Builder buildPart2(Object arg);

    /**
     * @return
     */
    Product build();
}