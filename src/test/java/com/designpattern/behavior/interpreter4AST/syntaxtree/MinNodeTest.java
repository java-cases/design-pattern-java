package com.designpattern.behavior.interpreter4AST.syntaxtree;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MinNodeTest {

    @Test
    public void getLiteral() {
        Node node = Node.valueOf("10").min("11");

        assertThat(node.getLiteral(), Matchers.equalTo("min(10,11)"));
    }

    @Test
    public void calculate() {
        Node node = Node.valueOf("10").min("11");

        assertThat(node.calculate().intValue(), Matchers.equalTo(10));
    }
}