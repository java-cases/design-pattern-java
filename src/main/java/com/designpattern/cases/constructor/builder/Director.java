package com.designpattern.cases.constructor.builder;

/**
 * 指导者负责指导装配过程，但是不负责每步具体的实现。
 */
public class Director {

    private Builder computerBuilder;

    public void setBuilder(Builder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Product getProduct() {
        return computerBuilder.getProduct();
    }

    public void construct() {
        computerBuilder.buildProduct();

        computerBuilder.buildMaster();
        computerBuilder.buildScreen();
        computerBuilder.buildKeyboard();
        computerBuilder.buildMouse();
        computerBuilder.buildAudio();
    }
}
