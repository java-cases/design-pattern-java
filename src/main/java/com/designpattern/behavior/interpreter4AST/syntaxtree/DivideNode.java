package com.designpattern.behavior.interpreter4AST.syntaxtree;


import com.designpattern.behavior.interpreter4AST.Context;

import java.math.BigDecimal;

public class DivideNode extends OperatorNode implements Node {

    public DivideNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected String getOperator() {
        return "/";
    }

    @Override
    public BigDecimal calculate(Context context) {
        return left.calculate(context).divide(right.calculate(context));
    }
}
