package com.designpattern.gof.creational.singleton;

public class Client {

    public static void main(String[] args) {
        testSingleton();
        testDoubleCheckedLockingSingleton();

        testStaticSingleton();
        testInnerClassSingleton();
        testEnumSingleton();
    }

    private static void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        instance1.operation();

        Singleton instance2 = Singleton.getInstance();
        instance2.operation();
    }

    private static void testDoubleCheckedLockingSingleton() {
        DoubleCheckedLockingSingleton instance1 = DoubleCheckedLockingSingleton.getInstance();
        instance1.operation();

        DoubleCheckedLockingSingleton instance2 = DoubleCheckedLockingSingleton.getInstance();
        instance2.operation();
    }

    private static void testStaticSingleton() {
        StaticSingleton instance1 = StaticSingleton.getInstance();
        instance1.operation();

        StaticSingleton instance2 = StaticSingleton.getInstance();
        instance2.operation();
    }

    private static void testInnerClassSingleton() {
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        instance1.operation();

        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        instance2.operation();
    }

    private static void testEnumSingleton() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        instance1.operation();

        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        instance2.operation();
    }
}