package com.designpattern.behavior.mediator.colleague;

import com.designpattern.behavior.mediator.IotGateway;

public class Alarm implements Furniture {

    @Override
    public void onEvent(IotGateway gateway) {
        gateway.doEvent("alarm");
    }

    public void perform() {
        System.out.println("Alarm.perform()");
    }
}
