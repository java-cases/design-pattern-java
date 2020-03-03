package com.designpattern.gof.behavioral.mediator;

/**
 *
 */
public class ColleagueA extends AbstractColleague {

    public ColleagueA() {
    }

    @Override
    public void send(Object arg) {
        System.out.println("ColleagueA.send()" + ", arg:" + arg);
        super.mediator.relay(this, arg);
    }

    @Override
    public void receive(Object arg) {
        System.out.println("ColleagueA.receive()" + ", arg:" + arg);
    }

}