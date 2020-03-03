package com.designpattern.cases.behavior.interpreter4AST.syntaxtree;

import com.designpattern.cases.behavior.interpreter4AST.Context;

import java.math.BigDecimal;

public class AddNode extends OperatorNode implements Node {

    public AddNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected String getOperator() {
        return "+";
    }

    @Override
    public BigDecimal calculate(Context context) {
        return left.calculate(context).add(right.calculate(context));
    }
}
