package com.designpattern.gof.structural.proxy.cglibproxyfactory;

public class Client {

    public static void main(String[] args) {
        Subject real = new RealSubject();
        CglibProxyFactory factory = new CglibProxyFactory(real);

        Subject proxy = (Subject) factory.getProxy();
        proxy.operation();
    }

}