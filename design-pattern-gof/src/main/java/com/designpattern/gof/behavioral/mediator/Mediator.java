package com.designpattern.gof.behavioral.mediator;

public interface Mediator {

    void register(Colleague colleague);

    void relay(Colleague from, Object arg);
}