package com.designpattern.constructor.builder4string;

/**
 * 一个简易的 StringBuilder 实现，参考了 JDK 1.8 源码。
 */
public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
