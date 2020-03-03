package com.designpattern.cases.behavior.visitor;

import com.designpattern.cases.behavior.visitor.element.Customer;
import com.designpattern.cases.behavior.visitor.element.Item;
import com.designpattern.cases.behavior.visitor.element.Order;

public interface Visitor {
    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
