package com.designpattern.gof.behavioral.mediator;

/**
 *
 */
public class ColleagueB extends AbstractColleague {

    public ColleagueB() {
    }

    @Override
    public void send(Object arg) {
        System.out.println("ColleagueB.send()" + ", arg:" + arg);
        super.mediator.relay(this, arg);
    }

    @Override
    public void receive(Object arg) {
        System.out.println("ColleagueB.receive()" + ", arg:" + arg);
    }

}