package com.designpattern.behavior.mediator;

import com.designpattern.behavior.mediator.colleague.Alarm;
import com.designpattern.behavior.mediator.colleague.Monitor;
import com.designpattern.behavior.mediator.colleague.CoffeePot;

public class Client {

    public static void main(String[] args) {
        perform();
    }

    public static void perform() {

        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Monitor monitor = new Monitor();

        IotGateway mediator = new IotGatewayImp(alarm, coffeePot, monitor);

        // 闹钟事件到达，调用中介者就可以操作相关对象
        alarm.onEvent(mediator);
    }
}
