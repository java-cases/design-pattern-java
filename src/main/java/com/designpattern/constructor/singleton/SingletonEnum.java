package com.designpattern.constructor.singleton;

public enum SingletonEnum {
    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    private SingletonEnum() {

    }
}
