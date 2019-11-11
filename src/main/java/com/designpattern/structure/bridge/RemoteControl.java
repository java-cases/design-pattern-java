package com.designpattern.structure.bridge;

import com.designpattern.structure.bridge.tv.TV;

public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
