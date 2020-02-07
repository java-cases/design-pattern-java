package com.designpattern.cases.behavior.visitor.element;

import com.designpattern.cases.behavior.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
