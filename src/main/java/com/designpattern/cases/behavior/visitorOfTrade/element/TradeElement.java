package com.designpattern.cases.behavior.visitorOfTrade.element;

import com.designpattern.cases.behavior.visitorOfTrade.TradeElementVisitor;

public interface TradeElement {
    String getName();

    void accept(TradeElementVisitor visitor);
}
