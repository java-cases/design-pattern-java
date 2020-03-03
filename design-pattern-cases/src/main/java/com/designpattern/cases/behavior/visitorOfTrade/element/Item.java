package com.designpattern.cases.behavior.visitorOfTrade.element;

import com.designpattern.cases.behavior.visitorOfTrade.TradeElementVisitor;

public class Item implements TradeElement {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(TradeElementVisitor visitor) {
        visitor.visit(this);
    }
}
