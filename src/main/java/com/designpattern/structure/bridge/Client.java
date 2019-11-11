package com.designpattern.structure.bridge;

import com.designpattern.structure.bridge.tv.RCA;
import com.designpattern.structure.bridge.tv.Sony;

public class Client {

    public static void main(String[] args) {
        RemoteControl remoteControl1 = new ConcreteRemoteControl1(new RCA());
        remoteControl1.on();
        remoteControl1.off();
        remoteControl1.tuneChannel();

        RemoteControl remoteControl2 = new ConcreteRemoteControl2(new Sony());
        remoteControl2.on();
        remoteControl2.off();
        remoteControl2.tuneChannel();
    }
}
