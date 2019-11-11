package com.designpattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String intrinsicState) {

        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }

        return flyweights.get(intrinsicState);
    }
}
