package com.designpattern.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * 动态代理模式。
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        Objects.requireNonNull(target);
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return invokeMethod(method, args);
                    }
                });
    }

    public Object getProxyInstanceLambda() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    return invokeMethod(method, args);
                });
    }

    private Object invokeMethod(Method method, Object[] args)
            throws IllegalAccessException, InvocationTargetException {
        System.out.println("Before method.invoke(adaptedtarget, args)");
        Object returnValue = method.invoke(target, args);
        System.out.println("After method.invoke(adaptedtarget, args)");
        return returnValue;
    }

}
