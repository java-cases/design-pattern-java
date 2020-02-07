package com.designpattern.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class FlyweightFactory {

    private Map<Object, Flyweight> pool = new HashMap<>();

    public FlyweightFactory() {
    }

    public void getFlyweight(Object key) {
        // TODO implement here
    }

}