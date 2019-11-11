package com.designpattern.structure.adapter;

import com.designpattern.structure.adapter.adaptedtarget.USAPower110V;
import com.designpattern.structure.adapter.adaptee.ChinaPower220V;
import org.junit.Test;

public class USACookerTest {

    @Test
    public void cookWith110V() {
        // 110 V 电压下直接 cook
        Cooker usaCooker = new USACooker(new USAPower110V());
        usaCooker.cook();
    }

    @Test
    public void cookWith220V() {
        // 220 V 电压下需要适配成 110V，才可 cook
        PowerAdapter adapter = new PowerAdapter(new ChinaPower220V());
        Cooker usaCooker = new USACooker(adapter);
        usaCooker.cook();
    }
}