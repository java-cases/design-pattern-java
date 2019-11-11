package com.designpattern.behavior.interpreter;

public interface Expression {

    String getLiteral();

    int interpret(Context context);

    static Expression terminal(String literal) {
        return new TerminalExpression(literal);
    }

    default Expression subtract(String literal) {
        Expression other = new TerminalExpression(literal);
        return this.subtract(other);
    }

    default Expression subtract(Expression other) {
        return new SubtractExpression(this, other);
    }

    default Expression add(String literal) {
        Expression other = new TerminalExpression(literal);
        return this.add(other);
    }

    default Expression add(Expression other) {
        return new AddExpression(this, other);
    }

}
