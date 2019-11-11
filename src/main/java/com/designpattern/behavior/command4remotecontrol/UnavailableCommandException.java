package com.designpattern.behavior.command4remotecontrol;

public class UnavailableCommandException extends Exception {

    public UnavailableCommandException() {
        super();
    }

    public UnavailableCommandException(String msg) {
        super(msg);
    }

    public UnavailableCommandException(ButtonSlot slot) {
        super("Invalid command! " + slot);
    }
}
