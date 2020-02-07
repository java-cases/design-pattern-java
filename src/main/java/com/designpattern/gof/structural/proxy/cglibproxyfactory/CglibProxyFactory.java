package com.designpattern.gof.structural.proxy.cglibproxyfactory;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        Enhancer enchancer = new Enhancer();
        enchancer.setSuperclass(this.target.getClass());
        enchancer.setCallback(this);
        return enchancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {

        Object returnObj = null;

        if ("operation".equals(method.getName())) {
            System.out.println("pre operation()");
            returnObj = method.invoke(this.target, objects);
            System.out.println("after operation()");
        } else {
            returnObj = method.invoke(this.target, objects);
        }

        return returnObj;
    }
}