package com.designpattern.gof.behavioral.mediator;

/**
 *
 */
public abstract class AbstractColleague implements Colleague {

    protected Mediator mediator;

    public AbstractColleague() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public abstract void send(Object arg);

    @Override
    public abstract void receive(Object arg);
}