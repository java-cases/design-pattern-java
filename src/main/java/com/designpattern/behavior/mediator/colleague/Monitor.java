package com.designpattern.behavior.mediator.colleague;

import com.designpattern.behavior.mediator.IotGateway;

public class Monitor implements Furniture {

    @Override
    public void onEvent(IotGateway gateway) {
        gateway.doEvent("monitor");
    }

    public void perform(){
        System.out.println("Monitor.perform()");
    }
}
