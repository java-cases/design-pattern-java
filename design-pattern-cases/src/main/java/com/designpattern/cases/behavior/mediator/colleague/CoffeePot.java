package com.designpattern.cases.behavior.mediator.colleague;

import com.designpattern.cases.behavior.mediator.IotGateway;

public class CoffeePot implements Furniture {

    @Override
    public void onEvent(IotGateway gateway) {
        gateway.doEvent("coffeePot");
    }

    public void perform() {
        System.out.println("CoffeePot.perform()");
    }
}
