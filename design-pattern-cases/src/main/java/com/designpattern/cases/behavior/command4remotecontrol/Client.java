package com.designpattern.cases.behavior.command4remotecontrol;

import com.designpattern.cases.behavior.command4remotecontrol.impl.Light;
import com.designpattern.cases.behavior.command4remotecontrol.impl.LightOffCommand;
import com.designpattern.cases.behavior.command4remotecontrol.impl.LightOnCommand;

public class Client {

    public static void main(String[] args) throws UnavailableCommandException {
        execute();
    }

    public static void execute() throws UnavailableCommandException {
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteContol remoteContol=new RemoteContol();

        remoteContol.setCommand(lightOnCommand, ButtonSlot.ON);
        remoteContol.setCommand(lightOffCommand, ButtonSlot.OFF);

        //执行命令
        remoteContol.pushButton(ButtonSlot.ON);
        remoteContol.pushButton(ButtonSlot.OFF);
    }
}
