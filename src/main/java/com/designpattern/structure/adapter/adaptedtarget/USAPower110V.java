package com.designpattern.structure.adapter.adaptedtarget;

public class USAPower110V implements USAPower {

    @Override
    public void connect() {
        System.out.println("110V 接通电源，开始工作...");
    }
}
