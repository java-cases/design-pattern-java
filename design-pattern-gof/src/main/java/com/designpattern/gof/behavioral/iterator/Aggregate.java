package com.designpattern.gof.behavioral.iterator;

import java.util.Iterator;

/**
 *
 */
public abstract class Aggregate<E> implements Iterable<E> {

    /**
     * Default constructor
     */
    public Aggregate() {
    }

    @Override
    public Iterator<E> iterator() {
        // TODO implement here
        return null;
    }

}