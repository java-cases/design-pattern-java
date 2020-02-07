package com.designpattern.cases.constructor.builder;

/**
 * 生成器的抽象类
 * 负责具体实现每步的对象
 */
public abstract class AbstractComputerBuilder implements Builder {
    protected Product product;

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void buildProduct(){
        product=new Product();
        System.out.println("生产出一台电脑");
    }

    @Override
    public abstract void buildMaster();

    @Override
    public abstract void buildScreen();

    @Override
    public abstract void buildKeyboard();

    @Override
    public abstract void buildMouse();

    @Override
    public abstract void buildAudio();
}
