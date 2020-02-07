package com.designpattern.cases.behavior.command4remotecontrol.impl;

import com.designpattern.cases.behavior.command4remotecontrol.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public Boolean execute() {
        return light.on();
    }
}
