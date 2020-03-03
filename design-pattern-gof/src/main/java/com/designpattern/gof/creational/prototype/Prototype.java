package com.designpattern.gof.creational.prototype;

/**
 *
 */
public interface Prototype extends Cloneable {
    Object clone() throws CloneNotSupportedException;

    void operation();
}