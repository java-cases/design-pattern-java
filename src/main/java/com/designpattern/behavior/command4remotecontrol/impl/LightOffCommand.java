package com.designpattern.behavior.command4remotecontrol.impl;

import com.designpattern.behavior.command4remotecontrol.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public Boolean execute() {
        return light.off();
    }
}
