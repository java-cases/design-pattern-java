package com.designpattern.cases.behavior.visitorOfTrade;

import com.designpattern.cases.behavior.visitorOfTrade.element.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(TradeElementVisitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
