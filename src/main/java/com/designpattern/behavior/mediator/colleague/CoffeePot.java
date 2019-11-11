package com.designpattern.behavior.mediator.colleague;

import com.designpattern.behavior.mediator.IotGateway;

public class CoffeePot implements Furniture {

    @Override
    public void onEvent(IotGateway gateway) {
        gateway.doEvent("coffeePot");
    }

    public void perform() {
        System.out.println("CoffeePot.perform()");
    }
}
