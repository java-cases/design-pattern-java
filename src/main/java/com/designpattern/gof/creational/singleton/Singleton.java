package com.designpattern.gof.creational.singleton;

/**
 *
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    /**
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void operation() {
        System.out.println("Singleton.operation()," + this.toString());
    }

}