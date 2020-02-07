package com.designpattern.cases.enumtype;

import java.util.Arrays;

public final class Colors implements Element{

    public static final Colors RED = new Colors("RED");
    public static final Colors GREEN = new Colors("GREEN");
    public static final Colors BLUE = new Colors("BLUE");

    private static final Colors[] $VALUES;
    private final String name;

    static {
        $VALUES = new Colors[]{RED, GREEN, BLUE};
    }

    private Colors(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static Colors[] values() {
        return Arrays.copyOf($VALUES, $VALUES.length);
    }

    public static Colors valueOf(String name) {
        return Arrays.stream($VALUES)
                .filter(x -> x.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("illegal name."));
    }
}
