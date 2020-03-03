package com.designpattern.gof.proxy.cglibproxyfactory;

import com.designpattern.gof.structural.proxy.cglibproxyfactory.CglibProxyFactory;
import com.designpattern.gof.structural.proxy.cglibproxyfactory.RealSubject;
import com.designpattern.gof.structural.proxy.cglibproxyfactory.Subject;
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