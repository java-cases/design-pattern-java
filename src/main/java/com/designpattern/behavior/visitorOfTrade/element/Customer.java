package com.designpattern.behavior.visitorOfTrade.element;


import com.designpattern.behavior.visitorOfTrade.TradeElementVisitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements TradeElement {

    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void accept(TradeElementVisitor visitor) {
        visitor.visit(this);

        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
