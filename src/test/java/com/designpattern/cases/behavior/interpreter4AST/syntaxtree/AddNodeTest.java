package com.designpattern.cases.behavior.interpreter4AST.syntaxtree;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AddNodeTest {

    @Test
    public void getLiteral() {
        Node node = Node.valueOf("10").add("10");

        assertThat(node.getLiteral(), Matchers.equalTo("(10+10)"));
    }

    @Test
    public void calculate() {
        Node node = Node.valueOf("10").add("10");

        assertThat(node.calculate().intValue(), Matchers.equalTo(20));
    }
}