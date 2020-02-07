package com.designpattern.gof.behavioral.iterator;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 */
public class ConcreteAggregate<E> extends Aggregate<E> {

    public Collection<E> items;

    public void ConcreteAggregate(Collection<E> items) {
        // TODO implement here
    }

    @Override
    public Iterator<E> iterator() {
        // TODO implement here
        return null;
    }

}