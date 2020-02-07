package com.designpattern.gof.structural.proxy.cglibproxyfactory;

public class RealSubject implements Subject {

    public RealSubject() {
    }

    public void operation() {
        System.out.println("RealSubject.operation()");
    }

}