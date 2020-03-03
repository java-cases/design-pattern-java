package com.designpattern.cases.constructor.singleton;

public enum SingletonEnum {
    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    SingletonEnum() {

    }
}
