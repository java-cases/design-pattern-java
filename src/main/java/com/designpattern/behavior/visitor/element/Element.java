package com.designpattern.behavior.visitor.element;

import com.designpattern.behavior.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
