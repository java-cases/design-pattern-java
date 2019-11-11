package com.designpattern.behavior.interpreter4AST.syntaxtree;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertThat;

public class ValueNodeTest {

    @Test
    public void getLiteral() {
        Node node = Node.valueOf("10");

        assertThat(node.getLiteral(), Matchers.equalTo("10"));
    }

    @Test
    public void calculate() {
        Node node = Node.valueOf("10");

        assertThat(node.calculate(), Matchers.equalTo(BigDecimal.valueOf(10.0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateFloat() {
        Node node = Node.valueOf("10.0");

        //assertThat(node.calculate(), Matchers.equalTo(BigDecimal.valueOf(0.0)));
    }

    @Test(expected = NullPointerException.class)
    public void calculateNull() {
        Node.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateEmpty() {
        Node.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateEmptySpace() {
        Node.valueOf("  ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateNonDigital() {
        Node.valueOf("hello");
    }

    @Test
    public void toStringOfInstance() {
        Node node = Node.valueOf("10");

        assertThat(node.toString(), Matchers.equalTo("10"));
    }
}