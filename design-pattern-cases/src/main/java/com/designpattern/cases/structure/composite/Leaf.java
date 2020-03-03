package com.designpattern.cases.structure.composite;

/**
 * 叶子对象
 */
public class Leaf implements Component {

    //叶子对象元素信息
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void doOperation(String context) {
        System.out.println(context + "-" + name);
    }
}