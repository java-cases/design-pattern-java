package com.designpattern.cases.structure.proxy;

import com.designpattern.cases.structure.proxy.dynamicproxy.ProxyFactory;
import com.designpattern.cases.structure.proxy.staticproxycommon.AbstractObject;
import com.designpattern.cases.structure.proxy.staticproxycommon.RealObject;
import org.junit.Test;

public class ProxyFactoryTest {

    @Test
    public void getProxyInstance() {

        AbstractObject realObject = new RealObject();
        System.out.println(realObject.getClass());

        AbstractObject proxy = (AbstractObject) new ProxyFactory(realObject).getProxyInstance();
        System.out.println(proxy.getClass());

        proxy.operation();
    }

    @Test
    public void getProxyInstanceLambda() {
        AbstractObject realObject = new RealObject();
        System.out.println(realObject.getClass());

        AbstractObject proxy = (AbstractObject) new ProxyFactory(realObject).getProxyInstanceLambda();
        System.out.println(proxy.getClass());

        proxy.operation();
    }
}