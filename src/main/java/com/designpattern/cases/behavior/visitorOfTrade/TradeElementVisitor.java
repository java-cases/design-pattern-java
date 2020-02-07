package com.designpattern.cases.behavior.visitorOfTrade;

import com.designpattern.cases.behavior.visitorOfTrade.element.TradeElement;

public interface TradeElementVisitor {
    void visit(TradeElement element);
}
