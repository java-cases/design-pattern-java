package com.designpattern.behavior.iterator;

import java.util.Iterator;
import java.util.List;

public class ConcreteIterator<E> implements Iterator<E> {

    private List<E> items;
    private int position = 0;

    public ConcreteIterator(List<E> items) {
        this.items = items;
    }

    @Override
    public E next() {
        return items.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }
}
