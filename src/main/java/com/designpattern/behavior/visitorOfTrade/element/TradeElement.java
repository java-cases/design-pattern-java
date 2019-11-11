package com.designpattern.behavior.visitorOfTrade.element;

import com.designpattern.behavior.visitorOfTrade.TradeElementVisitor;

public interface TradeElement {
    String getName();
    void accept(TradeElementVisitor visitor);
}
