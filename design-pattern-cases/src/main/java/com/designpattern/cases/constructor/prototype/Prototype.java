package com.designpattern.cases.constructor.prototype;

public interface Prototype {
    Prototype clone();
    void setData(String data);
}
