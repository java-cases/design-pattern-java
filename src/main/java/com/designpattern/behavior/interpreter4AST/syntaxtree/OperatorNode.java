package com.designpattern.behavior.interpreter4AST.syntaxtree;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class OperatorNode implements Node {
    protected Node left = null;
    protected Node right = null;

    public OperatorNode(Node left, Node right) {
        Objects.requireNonNull(left);
        Objects.requireNonNull(right);

        this.left = left;
        this.right = right;
    }

    @Override
    public BigDecimal calculate() {
        return this.calculate(null);
    }

    @Override
    public String getLiteral() {
        return "(" + left.getLiteral() + getOperator() + right.getLiteral() + ")";
    }

    protected abstract String getOperator();

    @Override
    public String toString() {
        return getLiteral();
    }
}
