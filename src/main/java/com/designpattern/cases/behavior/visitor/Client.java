package com.designpattern.cases.behavior.visitor;

import com.designpattern.cases.behavior.visitor.element.Customer;
import com.designpattern.cases.behavior.visitor.element.Item;
import com.designpattern.cases.behavior.visitor.element.Order;

public class Client {

    public static void main(String[] args) {
        visit();
    }

    public static void visit() {
        Customer customer1 = new Customer("customer1");
        customer1.addOrder(new Order("order1", "item1"));
        customer1.addOrder(new Order("order2", "item1"));
        customer1.addOrder(new Order("order3", "item1"));

        Order order = new Order("order_a");
        order.addItem(new Item("item_a1"));
        order.addItem(new Item("item_a2"));
        order.addItem(new Item("item_a3"));

        Customer customer2 = new Customer("customer2");
        customer2.addOrder(order);

        ObjectStructure customers = new ObjectStructure();
        customers.addCustomer(customer1);
        customers.addCustomer(customer2);

        ConcreteVisitor visitor = new ConcreteVisitor();

        customers.accept(visitor);

        visitor.displayResults();
    }
}
