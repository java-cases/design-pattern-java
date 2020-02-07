package com.designpattern.gof.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        Colleague c1 = new ColleagueA();
        Colleague c2 = new ColleagueB();

        Mediator mediator = new ConcreteMediator();
        mediator.register(c1);
        mediator.register(c2);

        c1.send("c1");
        c2.send("c2");
    }
}