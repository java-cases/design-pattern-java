package com.designpattern.cases.structure.composite;

public class Client {

    public static void main(String[] args) {

        //定义所有的组合对象
        Component root =buildComponent();

        //调用根对象的输出功能来输出整棵树
        root.doOperation("");
    }

    public static Component buildComponent() {

        //定义所有的组合对象
        Component root = Component.composite("服装");

        Component composite1 = Component.composite("男装");
        composite1.addChild(Component.leaf("衬衣"));
        composite1.addChild(Component.leaf("夹克"));

        Component composite2 = Component.composite("女装");
        composite2.addChild(Component.leaf("裙子"));
        composite2.addChild(Component.leaf("套装"));


        //按照树的结构来组合组合对象和叶子对象
        root.addChild(composite1);
        root.addChild(composite2);

        return root;
    }
}
