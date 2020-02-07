package com.designpattern.cases.behavior.visitor.element;


import com.designpattern.cases.behavior.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Element {

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

    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
