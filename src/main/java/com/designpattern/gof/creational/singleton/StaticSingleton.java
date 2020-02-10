package com.designpattern.gof.creational.singleton;

public class StaticSingleton {
    private static final StaticSingleton INSTANCE = new StaticSingleton();

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return INSTANCE;
    }

    public void operation() {
        System.out.println("StaticSingleton.operation()," + this.toString());
    }
}
