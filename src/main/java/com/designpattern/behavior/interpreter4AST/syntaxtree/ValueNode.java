package com.designpattern.behavior.interpreter4AST.syntaxtree;


import com.designpattern.behavior.interpreter4AST.Context;

import java.math.BigDecimal;
import java.util.Objects;

public class ValueNode implements Node {

    private String literal;

    public ValueNode(String literal) {
        String trimed = checkValueString(literal);

        this.literal = trimed;
    }

    private String checkValueString(String literal) {
        Objects.requireNonNull(literal);

        String trimed = requireNonEmpty(literal);

        requireDigital(literal);

        return trimed;
    }

    private String requireNonEmpty(String literal) {
        String trimed = literal.trim().replace(" ", "");
        if (trimed.isEmpty()) {
            throw new IllegalArgumentException("literal requireDigital not empty.");
        }
        return trimed;
    }

    private void requireDigital(String literal) {
        Boolean isDigit = literal.chars().allMatch(x -> Character.isDigit(x));
        if (!isDigit) {
            throw new IllegalArgumentException("literal require digital.");
        }
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    @Override
    public BigDecimal calculate() {
        return this.calculate(null);
    }

    @Override
    public BigDecimal calculate(Context context) {
        Double doubleValue = Double.valueOf(literal);
        return BigDecimal.valueOf(doubleValue);
    }

    @Override
    public String toString() {
        return literal;
    }
}
