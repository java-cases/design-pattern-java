package com.designpattern.cases.structure.proxy;

import com.designpattern.cases.structure.proxy.staticproxycommon.AbstractObject;
import com.designpattern.cases.structure.proxy.staticproxycommon.ProxyObject;
import org.junit.Test;

public class ProxyObjectTest {

    @Test
    public void operation() {
        AbstractObject proxyObject = new ProxyObject();
        proxyObject.operation();
    }
}