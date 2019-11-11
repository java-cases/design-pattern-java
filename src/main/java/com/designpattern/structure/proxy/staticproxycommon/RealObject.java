package com.designpattern.structure.proxy.staticproxycommon;

public class RealObject implements AbstractObject {

    @Override
    public void operation() {
        System.out.println("calling operate()");
    }
}
