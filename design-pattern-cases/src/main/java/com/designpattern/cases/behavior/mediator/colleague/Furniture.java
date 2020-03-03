package com.designpattern.cases.behavior.mediator.colleague;

import com.designpattern.cases.behavior.mediator.IotGateway;

public interface Furniture {
    void onEvent(IotGateway gateway);

    void perform();
}
