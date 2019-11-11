package com.designpattern.behavior.interpreter4AST.syntaxtree;

import com.designpattern.behavior.interpreter4AST.Context;

import java.math.BigDecimal;

public interface Node {

    String getLiteral();

    BigDecimal calculate();

    BigDecimal calculate(Context context);

    static Node valueOf(String literal) {
        return new ValueNode(literal);
    }

    default Node subtract(String literal) {
        Node other = new ValueNode(literal);
        return this.subtract(other);
    }

    default Node subtract(Node other) {
        return new SubtractNode(this, other);
    }

    default Node add(String literal) {
        Node other = new ValueNode(literal);
        return this.add(other);
    }

    default Node add(Node other) {
        return new AddNode(this, other);
    }

    default Node multiply(String literal) {
        Node other = new ValueNode(literal);
        return this.multiply(other);
    }

    default Node multiply(Node other) {
        return new MultiplyNode(this, other);
    }

    default Node divide(String literal) {
        Node other = new ValueNode(literal);
        return this.divide(other);
    }

    default Node divide(Node other) {
        return new DivideNode(this, other);
    }

    default Node max(String literal) {
        Node other = new ValueNode(literal);
        return max(this, other);
    }

    default Node max(Node other) {
        return max(this, other);
    }

    static Node max(Node left, Node right) {
        return new MaxNode(left, right);
    }

    default Node min(String literal) {
        Node other = new ValueNode(literal);
        return min(this, other);
    }

    default Node min(Node other) {
        return min(this, other);
    }

    static Node min(Node left, Node right) {
        return new MinNode(left, right);
    }

}
