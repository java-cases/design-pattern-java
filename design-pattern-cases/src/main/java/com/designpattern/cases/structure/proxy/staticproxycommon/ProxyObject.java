package com.designpattern.cases.structure.proxy.staticproxycommon;

/**
 * 静态代理模式。
 */
public class ProxyObject implements AbstractObject {

    RealObject realObject = new RealObject();

    @Override
    public void operation() {
        System.out.println("Before calling operate()");

        realObject.operation();

        System.out.println("After calling operate()");
    }
}
