package com.designpattern.cases.behavior.interpreter4AST;

import com.designpattern.cases.behavior.interpreter4AST.syntaxtree.Node;

import java.math.BigDecimal;

public class Calculator {

    public static Node BuildTree(String text) {
        return Node.valueOf("0");
    }

    public static BigDecimal cal(String text) {
        Context context=new Context(text);
        Node node = BuildTree(text);

        return node.calculate(context);
    }
}
