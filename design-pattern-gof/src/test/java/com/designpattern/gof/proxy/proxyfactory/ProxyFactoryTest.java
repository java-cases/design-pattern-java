package com.designpattern.gof.proxy.proxyfactory;

import com.designpattern.gof.structural.proxy.proxyfactory.ProxyFactory;
import com.designpattern.gof.structural.proxy.proxyfactory.RealSubject;
import com.designpattern.gof.structural.proxy.proxyfactory.Subject;
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