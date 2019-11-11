package com.designpattern.constructor.singleton;

public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
