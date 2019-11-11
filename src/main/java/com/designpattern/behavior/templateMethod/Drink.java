package com.designpattern.behavior.templateMethod;

public abstract class Drink {

    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 冲茶
     */
    abstract void brew();

    /**
     * 添加调料
     */
    abstract void addCondiments();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }

}
