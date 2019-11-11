package com.designpattern.behavior.iterator;

import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate<E> implements Aggregate<E> {

    private List<E> items;

    public ConcreteAggregate(List<E> items) {
        this.items = items;
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<>(items);
    }
}
