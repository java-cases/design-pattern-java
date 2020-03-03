package com.designpattern.gof.creational.singleton;

public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void operation() {
        System.out.println("InnerClassSingleton.operation()," + this.toString());
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
