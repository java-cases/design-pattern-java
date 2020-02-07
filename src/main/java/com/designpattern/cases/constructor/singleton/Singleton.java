package com.designpattern.cases.constructor.singleton;

public class Singleton {

    private String objName;


    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonEnum.INSTANCE.getSingleton();
    }

    private enum SingletonEnum {
        INSTANCE;

        private Singleton singleton;

        public Singleton getSingleton() {
            return singleton;
        }

        SingletonEnum() {
            singleton = new Singleton();
        }
    }
}
