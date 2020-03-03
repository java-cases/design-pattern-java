package com.designpattern.gof.structural.proxy.proxyfactory;


public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        Subject real = new RealSubject();

        Subject proxy = factory.getProxy(real);
        proxy.operation();
    }

}