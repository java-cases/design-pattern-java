package com.designpattern.cases.constructor.builder.impl;

import com.designpattern.cases.constructor.builder.AbstractComputerBuilder;
import com.designpattern.cases.constructor.builder.Builder;

public class HPComputerBuilder extends AbstractComputerBuilder implements Builder {

    @Override
    public void buildMaster() {
        product.setMaster("i7,16g,512SSD,1060");
        System.out.println("(i7,16g,512SSD,1060)的惠普主机");
    }

    @Override
    public void buildScreen() {
        product.setScreen("4K");
        System.out.println("(4K)的惠普显示屏");
    }

    @Override
    public void buildKeyboard() {
        product.setKeyboard("cherry 青轴机械键盘");
        System.out.println("(cherry 青轴机械键盘)的键盘");
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
