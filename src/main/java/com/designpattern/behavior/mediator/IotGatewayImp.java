package com.designpattern.behavior.mediator;

import com.designpattern.behavior.mediator.colleague.Alarm;
import com.designpattern.behavior.mediator.colleague.CoffeePot;
import com.designpattern.behavior.mediator.colleague.Monitor;

public class IotGatewayImp implements IotGateway {

    private Alarm alarm;
    private CoffeePot coffeePot;
    private Monitor monitor;

    public IotGatewayImp(Alarm alarm, CoffeePot coffeePot, Monitor monitor) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.monitor = monitor;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                handleAlarmEvent();
                break;
            case "coffeePot":
                handleCoffeePotEvent();
                break;
            default:
                handleMonitorEvent();
        }
    }

    public void handleAlarmEvent() {
        alarm.perform();
        coffeePot.perform();

        monitor.perform();
    }

    public void handleCoffeePotEvent() {
        monitor.perform();
    }

    public void handleMonitorEvent() {
        alarm.perform();
    }
}
