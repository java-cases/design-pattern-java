package com.designpattern.behavior.nullObject;

public class NullOperation implements AbstractOperation {

    @Override
    public void request() {
        System.out.println("do nothing");
    }
}
