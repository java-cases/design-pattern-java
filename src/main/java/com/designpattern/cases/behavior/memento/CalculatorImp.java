package com.designpattern.cases.behavior.memento;

/**
 * Originator Implementation
 */
public class CalculatorImp implements Calculator {

    private int firstNumber;
    private int secondNumber;

    @Override
    public BackupMemento backup() {
        // create a memento object used for restoring two numbers
        return new MementoImp(firstNumber, secondNumber);
    }

    @Override
    public void restore(BackupMemento memento) {
        this.firstNumber = ((Memento) memento).getFirst();
        this.secondNumber = ((Memento) memento).getSecond();
    }

    @Override
    public int calc() {
        // result is adding two numbers
        return firstNumber + secondNumber;
    }

    @Override
    public void setFirst(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public void setSecond(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
