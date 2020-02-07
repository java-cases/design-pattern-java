package com.designpattern.cases.structure.adapter;

import com.designpattern.cases.structure.adapter.adaptee.ChinaPower220V;
import org.junit.Test;

public class PowerAdapterTest {

    @Test
    public void connect() {
        PowerAdapter adapter = new PowerAdapter(new ChinaPower220V());
        adapter.connect();
    }

    @Test
    public void cookWith220V() {
        // 220 V 电压下需要适配成 110V，才可 cook
        PowerAdapter adapter = new PowerAdapter(new ChinaPower220V());
        Cooker usaCooker2 = new USACooker(adapter);
        usaCooker2.cook();
    }
}