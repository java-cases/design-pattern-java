package com.designpattern.behavior.visitor;

import com.designpattern.behavior.visitor.element.Customer;
import com.designpattern.behavior.visitor.element.Item;
import com.designpattern.behavior.visitor.element.Order;

public interface Visitor {
    void visit(Customer customer);
    void visit(Order order);
    void visit(Item item);
}
