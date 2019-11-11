package com.designpattern.behavior.interpreter4AST.syntaxtree;


import com.designpattern.behavior.interpreter4AST.Context;

import java.math.BigDecimal;

public class MultiplyNode extends OperatorNode implements Node {

    public MultiplyNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected String getOperator() {
        return "*";
    }

    @Override
    public BigDecimal calculate(Context context) {
        return left.calculate(context).multiply(right.calculate(context));
    }
}
