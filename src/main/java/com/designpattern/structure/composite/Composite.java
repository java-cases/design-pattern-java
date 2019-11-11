package com.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象，可以包含其它组合对象或者叶子对象
 */
public class Composite implements Component {

    private String name;

    /**
     * 用来存储组合对象中包含的子组件对象
     */
    private List<Component> childComponents;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public Component addChild(Component child) {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }

        childComponents.add(child);

        return child;
    }

    /**
     * /**
     * 输出组合对象自身的结构
     *
     * @param context 主要是按照层级拼接的空格，实现向后缩进
     */
    @Override
    public void doOperation(String context) {
        System.out.println(context + "+" + this.name);

        //如果还包含有子组件，那么就输出这些子组件对象
        if (this.childComponents != null) {

            //然后添加一个空格，表示向后缩进一个空格
            context += " ";

            //输出当前对象的子对象了
            for (Component child : childComponents) {

                //递归输出每个子对象
                child.doOperation(context);
            }
        }
    }
}