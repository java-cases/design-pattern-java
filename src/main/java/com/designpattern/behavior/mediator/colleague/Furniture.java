package com.designpattern.behavior.mediator.colleague;

import com.designpattern.behavior.mediator.IotGateway;

public interface Furniture {
    void onEvent(IotGateway gateway);
    void perform();
}
