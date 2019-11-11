package com.designpattern.constructor.singleton;

public class UnsafeLazyLoadSingleton {

    private static UnsafeLazyLoadSingleton uniqueInstance;

    private UnsafeLazyLoadSingleton() {
    }

    public static UnsafeLazyLoadSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new UnsafeLazyLoadSingleton();
        }
        return uniqueInstance;
    }
}
