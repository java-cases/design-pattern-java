package com.designpattern.cases.constructor.singleton;

public class Client {

    public static void main(String[] args) {
        testSingleton();
        testSingletonEnum();
    }

    private static void testSingleton() {
        // 单例测试
        Singleton firstSingleton = Singleton.getInstance();
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());

        Singleton secondSingleton = Singleton.getInstance();
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());
    }

    private static void testSingletonEnum() {
        // 单例测试
        SingletonEnum firstSingleton = SingletonEnum.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());

        SingletonEnum secondSingleton = SingletonEnum.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        // 反射获取实例测试
        SingletonEnum[] enumConstants = SingletonEnum.class.getEnumConstants();
        for (SingletonEnum enumConstant : enumConstants) {
            System.out.println(enumConstant.getObjName());
        }
    }
}
