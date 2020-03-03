package com.designpattern.cases.behavior.visitorOfTrade;

import com.designpattern.cases.behavior.visitorOfTrade.element.Customer;
import com.designpattern.cases.behavior.visitorOfTrade.element.Item;
import com.designpattern.cases.behavior.visitorOfTrade.element.Order;
import com.designpattern.cases.behavior.visitorOfTrade.element.TradeElement;

public class TradeReport implements TradeElementVisitor {

    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    public void visit(TradeElement element) {
        System.out.println(element.getName());

        if (element instanceof Customer) {
            customersNo++;
            return;
        }

        if (element instanceof Order) {
            ordersNo++;
            return;
        }

        if (element instanceof Item) {
            itemsNo++;
        }

    }

    public void displayResults() {
        System.out.println("Number of customers: " + customersNo);
        System.out.println("Number of orders:    " + ordersNo);
        System.out.println("Number of items:     " + itemsNo);
    }
}
