package com.designpattern.behavior.iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregateTest {

    @Test
    public void forEach() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>(nums);

        aggregate.forEach(x -> System.out.println(x));
    }

    @Test
    public void iterable() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Aggregate<Integer> aggregate = new ConcreteAggregate<>(nums);

        for (Integer e : aggregate) {
            System.out.println(e);
        }
    }

    @Test
    public void iterator() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Aggregate<Integer> aggregate = new ConcreteAggregate<>(nums);

        Iterator<Integer> iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}