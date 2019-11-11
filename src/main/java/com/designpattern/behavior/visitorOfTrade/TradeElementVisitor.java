package com.designpattern.behavior.visitorOfTrade;

import com.designpattern.behavior.visitorOfTrade.element.TradeElement;

public interface TradeElementVisitor {
    void visit(TradeElement element);
}
