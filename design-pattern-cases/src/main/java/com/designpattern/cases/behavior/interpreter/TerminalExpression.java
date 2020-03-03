package com.designpattern.cases.behavior.interpreter;

public class TerminalExpression implements Expression {

    private String literal = null;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    @Override
    public int interpret(Context context) {
        String valueString = literal.trim();
        Boolean isDigit = valueString.chars().allMatch(x -> Character.isDigit(x));

        return isDigit ? Integer.valueOf(valueString) : 0;
    }

    @Override
    public String toString() {
        return literal;
    }
}
