package com.designpattern.behavior.strategy;

/**
 * Context 是使用到该算法族的类，其中的 doSomething()方法会调用 behavior()，
 * setStrategy(PriceStrategy) 方法可以动态地改变 strategy 对象，
 * 也就是说能动态地改变 Context 所使用的算法。
 */
public class Price {

    private PriceStrategy strategy;

    public void calc(double goodsPrice){
        strategy.calc(goodsPrice);
    }

    public void setStrategy(PriceStrategy strategy) {
        this.strategy = strategy;
    }
}
