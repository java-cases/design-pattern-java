package com.designpattern.cases.behavior.strategy;

public class NormalCustomerStrategy implements PriceStrategy {

    @Override
    public void calc(double goodsPrice) {
        System.out.println("对于新客户或者是普通客户，没有折扣: " + goodsPrice);
    }
}
