package com.designpattern.behavior.command4remotecontrol.impl;

public class Light {

    public Boolean on() {
        System.out.println("Light is on!");
        return true;
    }

    public Boolean off() {
        System.out.println("Light is off!");
        return true;
    }

}
