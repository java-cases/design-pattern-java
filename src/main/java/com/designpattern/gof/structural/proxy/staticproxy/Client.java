package com.designpattern.gof.structural.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        Subject real = new RealSubject();
        Subject proxy = new Proxy(real);

        proxy.operation();
    }

}