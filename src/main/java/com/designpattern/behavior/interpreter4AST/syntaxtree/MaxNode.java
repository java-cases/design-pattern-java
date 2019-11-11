package com.designpattern.behavior.interpreter4AST.syntaxtree;


import com.designpattern.behavior.interpreter4AST.Context;

import java.math.BigDecimal;

public class MaxNode extends OperatorNode implements Node {

    public MaxNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public String getLiteral() {
        return getOperator() + "(" + left.getLiteral() + "," + right.getLiteral() + ")";
    }

    @Override
    protected String getOperator() {
        return "max";
    }

    @Override
    public BigDecimal calculate(Context context) {
        BigDecimal leftValue = left.calculate(context);
        BigDecimal rightValue = right.calculate(context);

        return leftValue.compareTo(rightValue) > 0 ? leftValue : rightValue;
    }


}
