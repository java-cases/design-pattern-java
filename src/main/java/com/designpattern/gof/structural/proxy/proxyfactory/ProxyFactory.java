package com.designpattern.gof.structural.proxy.proxyfactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class ProxyFactory {

    private Subject target;

    public ProxyFactory() {
    }

    public Subject getProxy(Subject target) {
        Objects.requireNonNull(target);
        this.target = target;

        return (Subject) Proxy.newProxyInstance(
                this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    return invokeMethod(method, args);
                });
    }

    private Subject invokeMethod(Method method, Object[] args)
            throws InvocationTargetException, IllegalAccessException {
        System.out.println("Before method.invoke(target, args)");
        Object returnValue = method.invoke(this.target, args);
        System.out.println("After method.invoke(target, args)");

        return (Subject) returnValue;
    }

}