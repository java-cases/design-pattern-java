package com.designpattern.behavior.visitorOfTrade;

import com.designpattern.behavior.visitorOfTrade.element.Customer;
import com.designpattern.behavior.visitorOfTrade.element.Item;
import com.designpattern.behavior.visitorOfTrade.element.Order;
import com.designpattern.behavior.visitorOfTrade.element.TradeElement;

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

        if (Order.class.isInstance(element)) {
            ordersNo++;
            return;
        }

        if (Item.class.isInstance(element)) {
            itemsNo++;
        }

    }

    public void displayResults() {
        System.out.println("Number of customers: " + customersNo);
        System.out.println("Number of orders:    " + ordersNo);
        System.out.println("Number of items:     " + itemsNo);
    }
}
