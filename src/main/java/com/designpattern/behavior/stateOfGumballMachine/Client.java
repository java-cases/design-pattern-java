package com.designpattern.behavior.stateOfGumballMachine;

public class Client {

    public static void main(String[] args) {
        takeActions();
    }

    public static void takeActions() {
        GumballMachine machine = new GumballMachine(5);

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
    }

}
