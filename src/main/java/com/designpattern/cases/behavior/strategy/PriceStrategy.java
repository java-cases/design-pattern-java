package com.designpattern.cases.behavior.strategy;

/**
 * 策略，定义计算报价算法的接口
 */
public interface PriceStrategy {

    /**
     * 计算报价
     * @param goodsPrice 商品原价
     */
    void calc(double goodsPrice);
}
