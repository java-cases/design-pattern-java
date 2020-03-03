package com.designpattern.gof.proxy.staticproxy;

import com.designpattern.gof.structural.proxy.staticproxy.Proxy;
import com.designpattern.gof.structural.proxy.staticproxy.RealSubject;
import com.designpattern.gof.structural.proxy.staticproxy.Subject;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void operation() {
        Subject real = new RealSubject();
        Subject proxy = new Proxy(real);

        proxy.operation();
    }
}