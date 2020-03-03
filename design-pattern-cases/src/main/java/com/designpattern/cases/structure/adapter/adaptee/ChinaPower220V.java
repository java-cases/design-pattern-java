package com.designpattern.cases.structure.adapter.adaptee;

public class ChinaPower220V implements ChinaPower {

    @Override
    public void connect() {
        System.out.println("220V 接通电源，开始工作...");
    }
}
