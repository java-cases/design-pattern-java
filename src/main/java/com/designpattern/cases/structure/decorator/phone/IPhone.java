package com.designpattern.cases.structure.decorator.phone;

/**
 * ConcreteComponent：具体的组件对象，实现组件对象接口，
 * 通常就是被装饰器装饰的原始对象，也就是可以给这个对象添加职责。
 */
public class IPhone implements Phone{
    @Override
    public void call() {
        System.out.println("IPhone打电话");
    }
}
