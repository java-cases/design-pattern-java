package com.designpattern.gof.structural.proxy.cglibproxyfactory;

import org.junit.Test;

public class CglibProxyFactoryTest {

    @Test
    public void getProxy() {
        Subject real = new RealSubject();
        CglibProxyFactory factory = new CglibProxyFactory(real);

        Subject proxy = (Subject) factory.getProxy();
        proxy.operation();
    }
}