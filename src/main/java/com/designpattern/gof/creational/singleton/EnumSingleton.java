package com.designpattern.gof.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
    }

    public void operation() {
        System.out.println("EnumSingleton.operation()," + INSTANCE.toString());
    }
}
