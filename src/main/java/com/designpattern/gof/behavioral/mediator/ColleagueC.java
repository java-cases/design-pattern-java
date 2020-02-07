package com.designpattern.gof.behavioral.mediator;

/**
 *
 */
public class ColleagueC extends AbstractColleague {

    public ColleagueC() {
    }

    @Override
    public void send(Object arg) {
        System.out.println("ColleagueC.send()" + ", arg:" + arg);
        super.mediator.relay(this, arg);
    }

    @Override
    public void receive(Object arg) {
        System.out.println("ColleagueC.receive()" + ", arg:" + arg);
    }

}