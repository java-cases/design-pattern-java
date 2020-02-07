package com.designpattern.gof.structural.proxy.staticproxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void operation() {
        Subject real = new RealSubject();
        Subject proxy = new Proxy(real);

        proxy.operation();
    }
}