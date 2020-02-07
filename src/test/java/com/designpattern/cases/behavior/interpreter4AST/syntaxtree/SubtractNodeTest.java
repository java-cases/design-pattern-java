package com.designpattern.cases.behavior.interpreter4AST.syntaxtree;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertThat;

public class SubtractNodeTest {

    @Test
    public void getLiteral() {
        Node node = Node.valueOf("10").subtract("10");

        assertThat(node.getLiteral(), Matchers.equalTo("(10-10)"));
    }

    @Test
    public void calculate() {
        Node node = Node.valueOf("10").subtract("10");

        assertThat(node.calculate(), Matchers.equalTo(BigDecimal.valueOf(0.0)));
    }
}