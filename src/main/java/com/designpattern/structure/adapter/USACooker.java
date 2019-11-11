package com.designpattern.structure.adapter;

import com.designpattern.structure.adapter.adaptedtarget.USAPower;

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
