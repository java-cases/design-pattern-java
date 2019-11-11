package com.designpattern.behavior.nullObject;

public class RealOperation implements AbstractOperation {

    @Override
    public void request() {
        System.out.println("do something");
    }
}
