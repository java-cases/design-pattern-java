package com.designpattern.behavior.visitor;

import com.designpattern.behavior.visitor.element.Customer;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Customer> customers = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
