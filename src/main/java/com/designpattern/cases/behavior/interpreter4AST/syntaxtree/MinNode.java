package com.designpattern.cases.behavior.interpreter4AST.syntaxtree;


import com.designpattern.cases.behavior.interpreter4AST.Context;

import java.math.BigDecimal;

public class MinNode extends OperatorNode implements Node {

    public MinNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public String getLiteral() {
        return getOperator() + "(" + left.getLiteral() + "," + right.getLiteral() + ")";
    }

    @Override
    protected String getOperator() {
        return "min";
    }

    @Override
    public BigDecimal calculate(Context context) {
        BigDecimal leftValue = left.calculate(context);
        BigDecimal rightValue = right.calculate(context);

        return leftValue.compareTo(rightValue) < 0 ? leftValue : rightValue;
    }
}
