package com.designpattern.cases.behavior.strategy;

public class OldCustomerStrategy implements PriceStrategy {

    @Override
    public void calc(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%: " + goodsPrice * (1 - 0.05));
    }
}
