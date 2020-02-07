package com.designpattern.cases.behavior.nullObject;

public class Client {

    public static void main(String[] args) {
        request();
    }

    public static void request() {
        AbstractOperation operation = getObject(-1);
        operation.request();

        operation = getObject(1);
        operation.request();
    }

    private static AbstractOperation getObject(int arg) {
        if (arg < 0) {
            return new NullOperation();
        }

        return new RealOperation();
    }
}
