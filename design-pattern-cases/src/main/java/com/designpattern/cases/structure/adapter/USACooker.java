package com.designpattern.cases.structure.adapter;

import com.designpattern.cases.structure.adapter.adaptedtarget.USAPower;

public class USACooker implements Cooker {

    private USAPower power;

    public USACooker(USAPower power) {
        this.power = power;
    }

    @Override
    public void cook(){
        power.connect();
        System.out.println("开始煮饭...");
    }
}
