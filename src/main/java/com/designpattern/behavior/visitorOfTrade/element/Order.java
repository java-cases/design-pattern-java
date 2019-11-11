package com.designpattern.behavior.visitorOfTrade.element;

import com.designpattern.behavior.visitorOfTrade.TradeElementVisitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements TradeElement {

    private String name;
    private List<Item> items = new ArrayList();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void accept(TradeElementVisitor visitor) {
        visitor.visit(this);

        for (Item item : items) {
            item.accept(visitor);
        }
    }
}