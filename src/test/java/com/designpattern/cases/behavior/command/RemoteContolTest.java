package com.designpattern.cases.behavior.command;

import com.designpattern.cases.behavior.command4remotecontrol.ButtonSlot;
import com.designpattern.cases.behavior.command4remotecontrol.Command;
import com.designpattern.cases.behavior.command4remotecontrol.RemoteContol;
import com.designpattern.cases.behavior.command4remotecontrol.UnavailableCommandException;
import com.designpattern.cases.behavior.command4remotecontrol.impl.Light;
import com.designpattern.cases.behavior.command4remotecontrol.impl.LightOffCommand;
import com.designpattern.cases.behavior.command4remotecontrol.impl.LightOnCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RemoteContolTest {

    @Test
    public void pushOnButton() throws UnavailableCommandException {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        RemoteContol remoteContol = new RemoteContol();

        Command command = remoteContol.setCommand(lightOnCommand, ButtonSlot.ON);
        assertEquals(null, command);

        command = remoteContol.setCommand(lightOnCommand, ButtonSlot.ON);
        assertEquals(lightOnCommand, command);

        //执行命令
        Boolean r = remoteContol.pushButton(ButtonSlot.ON);
        assertTrue(r);
    }

    @Test(expected = UnavailableCommandException.class)
    public void pushInvalidButton() throws UnavailableCommandException {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        RemoteContol remoteContol = new RemoteContol();

        remoteContol.setCommand(lightOnCommand, ButtonSlot.ON);

        //执行命令
        remoteContol.pushButton(ButtonSlot.OFF);
    }

    @Test
    public void pushOffButton() throws UnavailableCommandException {
        Light light = new Light();
        Command lightOffCommand = new LightOffCommand(light);
        RemoteContol remoteContol = new RemoteContol();

        Command command = remoteContol.setCommand(lightOffCommand, ButtonSlot.OFF);
        assertEquals(null, command);

        command = remoteContol.setCommand(lightOffCommand, ButtonSlot.OFF);
        assertEquals(lightOffCommand, command);

        //执行命令
        Boolean r = remoteContol.pushButton(ButtonSlot.OFF);
        assertTrue(r);
    }
}