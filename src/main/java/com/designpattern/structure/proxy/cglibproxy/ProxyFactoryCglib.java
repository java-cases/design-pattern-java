package com.designpattern.structure.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Objects;

public class ProxyFactoryCglib implements MethodInterceptor {

    private Object target;

    public ProxyFactoryCglib(Object target) {
        Objects.requireNonNull(target);
        this.target = target;
    }

    public Object getProxyInstance() {

        Enhancer en = new Enhancer();
        en.setSuperclass(this.target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {

        System.out.println("Begin method.invoke(adaptedtarget, objects");
        Object returnValue = method.invoke(target, objects);
        System.out.println("End method.invoke(adaptedtarget, objects");

        return returnValue;
    }
}
