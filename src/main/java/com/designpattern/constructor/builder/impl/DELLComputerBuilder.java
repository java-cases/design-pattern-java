package com.designpattern.constructor.builder.impl;

import com.designpattern.constructor.builder.AbstractComputerBuilder;
import com.designpattern.constructor.builder.Builder;

public class DELLComputerBuilder extends AbstractComputerBuilder implements Builder {

    @Override
    public void buildMaster() {
        product.setMaster("i7,32g,1TSSD,1060");
        System.out.println("(i7,32g,1TSSD,1060)的戴尔主机");
    }

    @Override
    public void buildScreen() {
        product.setScreen("4k");
        System.out.println("(4k)的dell显示屏");
    }

    @Override
    public void buildKeyboard() {
        product.setKeyboard("cherry 黑轴机械键盘");
        System.out.println("(cherry 黑轴机械键盘)的键盘");
    }

    @Override
    public void buildMouse() {
        product.setMouse("MI 鼠标");
        System.out.println("(MI 鼠标)的鼠标");
    }

    @Override
    public void buildAudio() {
        product.setAudio("飞利浦 音响");
        System.out.println("(飞利浦 音响)的音响");
    }
}
