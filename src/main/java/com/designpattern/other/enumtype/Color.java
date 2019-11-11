package com.designpattern.other.enumtype;

public enum Color implements Element{

    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE");

    private final String name;

    private Color(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static String getName(Color color) {
        return color.getName();
    }


}
