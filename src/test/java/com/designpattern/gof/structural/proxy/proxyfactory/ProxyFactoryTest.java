package com.designpattern.gof.structural.proxy.proxyfactory;

import org.junit.Test;

public class ProxyFactoryTest {

    @Test
    public void getProxy() {
        ProxyFactory factory = new ProxyFactory();
        Subject real = new RealSubject();

        Subject proxy = factory.getProxy(real);
        proxy.operation();
    }
}