package com.designpattern.constructor.prototype;

public class ConcretePrototype implements Prototype {

    private String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(data);
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}