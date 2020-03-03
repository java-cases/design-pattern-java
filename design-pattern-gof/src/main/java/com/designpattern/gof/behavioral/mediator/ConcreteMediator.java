package com.designpattern.gof.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ConcreteMediator implements Mediator {

    public List<Colleague> colleagues = new ArrayList<>();

    public ConcreteMediator() {
    }

    @Override
    public void register(Colleague colleague) {
        if (colleagues.contains(colleague)) {
            return;
        }

        colleague.setMediator(this);
        colleagues.add(colleague);
    }

    @Override
    public void relay(Colleague from, Object arg) {
        for (Colleague colleague : colleagues) {
            if (!colleague.equals(from)) {
                colleague.receive(arg);
            }
        }
    }

}