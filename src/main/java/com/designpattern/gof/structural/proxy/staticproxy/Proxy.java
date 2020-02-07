package com.designpattern.gof.structural.proxy.staticproxy;

public class Proxy implements Subject {

    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    private void preRequest() {
        System.out.println("Proxy.preRequest()");
    }

    public void operation() {
        this.preRequest();
        this.realSubject.operation();
        this.afterRequest();
    }

    private void afterRequest() {
        System.out.println("Proxy.afterRequest()");
    }

}