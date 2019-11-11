package com.designpattern.constructor.builder;

public interface Builder {

    Product getProduct();

    void buildProduct();

    void buildMaster();

    void buildScreen();

    void buildKeyboard();

    void buildMouse();

    void buildAudio();

}
