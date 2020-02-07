package com.designpattern.cases.behavior.visitor.element;

import com.designpattern.cases.behavior.visitor.Visitor;

public class Item implements Element {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
