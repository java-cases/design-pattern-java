package com.designpattern.behavior.interpreter4AST.syntaxtree;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxNodeTest {

    @Test
    public void getLiteral() {
        Node node = Node.valueOf("10").max("11");

        assertThat(node.getLiteral(), Matchers.equalTo("max(10,11)"));
    }

    @Test
    public void calculate() {
        Node node = Node.valueOf("10").max("11");

        assertThat(node.calculate().intValue(), Matchers.equalTo(11));
    }
}