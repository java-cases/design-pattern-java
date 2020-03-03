package com.designpattern.gof.behavioral.iterator;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 */
public class ConcreteIterator<E> implements Iterator<E> {

    /**
     *
     */
    public Collection<E> items;

    /**
     * Default constructor
     */
    public ConcreteIterator() {
    }

    /**
     * @param items
     */
    public void ConcreteIterator(Collection<E> items) {
        // TODO implement here
    }

    @Override
    public boolean hasNext() {
        // TODO implement here
        return false;
    }

    @Override
    public E next() {
        // TODO implement here
        return null;
    }

}