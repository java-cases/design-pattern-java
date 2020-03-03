package com.designpattern.cases.structure.composite;

/**
 * 组件抽象类
 */
public interface Component {

    /**
     * 输出组件自身的名称
     */
    void doOperation(String context);

    /**
     * 向组合对象中加入组件对象
     *
     * @param child 被加入组合对象中的组件对象
     */
    default Component addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 从组合对象中移出某个组件对象
     *
     * @param child 被移出的组件对象
     */
    default void remove(Component child) {
        throw new UnsupportedOperationException("对象不支持移除功能");
    }

    /**
     * 返回某个索引对应的组件对象
     *
     * @param index 需要获取的组件对象的索引，索引从0开始
     * @return 索引对应的组件对象
     */
    default Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持获取子节点功能");
    }

    static Component composite(String name) {
        return new Composite(name);
    }

    static Component leaf(String name) {
        return new Leaf(name);
    }
}
