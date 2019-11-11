package com.designpattern.behavior.interpreter4AST.syntaxtree;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class NodeTest {

    @Test
    public void getLiteralMax() {
        Node node1 = Node.valueOf("10").add("5").multiply("10");
        Node node2 = Node.valueOf("200").subtract("4").divide("2");

        Node tree = Node.max(node1, node2);
        assertThat(tree.getLiteral(), Matchers.equalTo("max(((10+5)*10),((200-4)/2))"));

        tree = node1.max(node2);
        assertThat(tree.getLiteral(), Matchers.equalTo("max(((10+5)*10),((200-4)/2))"));

        tree = node1.max("140");
        assertThat(tree.getLiteral(), Matchers.equalTo("max(((10+5)*10),140)"));
    }

    @Test
    public void calculateMax() {
        Node node1 = Node.valueOf("10").add("5").multiply("10");
        Node node2 = Node.valueOf("200").subtract("4").divide("2");

        Node tree = node1.max(node2);
        assertThat(tree.calculate().intValue(), Matchers.equalTo(150));

        tree = node1.max(node2);
        assertThat(tree.calculate().intValue(), Matchers.equalTo(150));

        tree = node1.max("140");
        assertThat(tree.calculate().intValue(), Matchers.equalTo(150));
    }

    @Test
    public void getLiteralMin() {
        Node node1 = Node.valueOf("10").add("5").multiply("10");
        Node node2 = Node.valueOf("200").subtract("4").divide("2");

        Node tree = Node.min(node1, node2);
        assertThat(tree.getLiteral(), Matchers.equalTo("min(((10+5)*10),((200-4)/2))"));

        tree = node1.min(node2);
        assertThat(tree.getLiteral(), Matchers.equalTo("min(((10+5)*10),((200-4)/2))"));

        tree = node1.min("140");
        assertThat(tree.getLiteral(), Matchers.equalTo("min(((10+5)*10),140)"));
    }

    @Test
    public void calculateMin() {
        Node node1 = Node.valueOf("10").add("5").multiply("10");
        Node node2 = Node.valueOf("200").subtract("4").divide("2");

        Node tree = node1.min(node2);
        assertThat(tree.calculate().intValue(), Matchers.equalTo(98));

        tree = node1.min(node2);
        assertThat(tree.calculate().intValue(), Matchers.equalTo(98));

        tree = node1.min("140");
        assertThat(tree.calculate().intValue(), Matchers.equalTo(140));
    }
}