package com.designpattern.cases.structure.adapter;

import com.designpattern.cases.structure.adapter.adaptedtarget.USAPower110V;
import com.designpattern.cases.structure.adapter.adaptee.ChinaPower220V;

public class Client {

    public static void main(String[] args) {
        cook();
    }

    public static void cook(){
        // 110 V 电压下直接 cook
        Cooker cooker = new USACooker(new USAPower110V());
        cooker.cook();

        // 220 V 电压下需要适配成 110V，才可 cook
        PowerAdapter adapter = new PowerAdapter(new ChinaPower220V());
        cooker = new USACooker(adapter);
        cooker.cook();
    }
}
