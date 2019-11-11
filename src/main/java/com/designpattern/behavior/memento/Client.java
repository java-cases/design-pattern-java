package com.designpattern.behavior.memento;

/**
 * CareTaker object
 */
public class Client {

    public static void main(String[] args) {
        perform();
    }

    public static void perform() {
        // program starts
        Calculator calculator = new CalculatorImp();

        BackupMemento memento = backup(calculator);

        restore(calculator, memento);

    }

    private static BackupMemento backup(Calculator calculator) {
        // assume user enters two numbers
        calculator.setFirst(10);
        calculator.setSecond(100);

        // find result
        System.out.println(calculator.calc());

        // Store result of this calculation in case of error
        return calculator.backup();
    }

    private static void restore(Calculator calculator, BackupMemento memento) {
        // user enters a number
        calculator.setFirst(17);

        // user enters a wrong second number and calculates result
        calculator.setSecond(-290);

        // calculate result
        System.out.println(calculator.calc());

        // user hits CTRL + Z to undo last operation and see last result
        calculator.restore(memento);

        // result restored
        System.out.println(calculator.calc());
    }
}
