package com.designpattern.constructor.prototype;

public interface Prototype {
    Prototype clone();
    void setData(String data);
}
