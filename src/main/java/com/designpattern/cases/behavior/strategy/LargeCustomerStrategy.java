package com.designpattern.cases.behavior.strategy;

public class LargeCustomerStrategy implements PriceStrategy {

    @Override
    public void calc(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%: " + goodsPrice * (1 - 0.1));
    }
}
