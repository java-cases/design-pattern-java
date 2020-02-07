package com.designpattern.cases.behavior.iterator;

import java.util.Iterator;

public interface Aggregate<E> extends Iterable<E>{
    Iterator<E> iterator();
}
