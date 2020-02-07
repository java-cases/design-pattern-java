package com.designpattern.cases.behavior.command4remotecontrol;

import java.util.EnumMap;

public class RemoteContol {

    private EnumMap<ButtonSlot, Command> commands;

    public RemoteContol() {
        int slotNum = 11;
        commands = new EnumMap<>(ButtonSlot.class);
    }

    public Command setCommand(Command command, ButtonSlot slot) {
        return commands.put(slot, command);
    }

    public Boolean pushButton(ButtonSlot slot)
            throws UnavailableCommandException {

        Command command = commands.get(slot);
        if (command == null) {
            throw new UnavailableCommandException(slot);
        }

        return command.execute();
    }
}
