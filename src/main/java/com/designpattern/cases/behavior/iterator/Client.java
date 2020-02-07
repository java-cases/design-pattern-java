package com.designpattern.cases.behavior.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        iterator();
    }

    public static void iterator() {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Aggregate<Integer> aggregate = new ConcreteAggregate<>(nums);
        Iterator<Integer> iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void forEach() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>(nums);

        aggregate.forEach(x -> System.out.println(x));
    }

    public static void iterable() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Aggregate<Integer> aggregate = new ConcreteAggregate<>(nums);

        for (Integer e : aggregate) {
            System.out.println(e);
        }
    }
}
