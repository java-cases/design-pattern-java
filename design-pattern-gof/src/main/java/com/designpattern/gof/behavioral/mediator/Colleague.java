package com.designpattern.gof.behavioral.mediator;

/**
 *
 */
public interface Colleague {

    void setMediator(Mediator mediator);

    void send(Object arg);

    void receive(Object arg);
}