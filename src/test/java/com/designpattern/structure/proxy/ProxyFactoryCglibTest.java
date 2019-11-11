package com.designpattern.structure.proxy;

import com.designpattern.structure.proxy.cglibproxy.ProxyFactoryCglib;
import com.designpattern.structure.proxy.staticproxycommon.RealObject;
import org.junit.Test;

public class ProxyFactoryCglibTest {

    @Test
    public void getProxyInstance() {
        RealObject realObject = new RealObject();
        System.out.println(realObject.getClass());

        RealObject proxy = (RealObject) new ProxyFactoryCglib(realObject).getProxyInstance();
        System.out.println(proxy.getClass());

        proxy.operation();
    }
}