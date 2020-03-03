package com.designpattern.cases.behavior.interpreter;

public class AddExpression implements Expression {

    private Expression left = null;
    private Expression right = null;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getLiteral() {
        return "(" + left.getLiteral() + " + " + right.getLiteral() + ")";
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return getLiteral();
    }
}
