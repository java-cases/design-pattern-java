package com.designpattern.structure.adapter;

import com.designpattern.structure.adapter.adaptedtarget.USAPower;
import com.designpattern.structure.adapter.adaptee.ChinaPower;

public class PowerAdapter implements USAPower {

    private final ChinaPower power;

    public PowerAdapter(ChinaPower power){
        this.power =power;
    }

    @Override
    public void connect() {
        power.connect();
    }
}
