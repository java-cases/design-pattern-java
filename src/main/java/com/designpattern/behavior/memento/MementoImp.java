package com.designpattern.behavior.memento;

/**
 * Memento Object Implementation
 * <p>
 * Note that this object implements both interfaces to Originator and CareTaker
 */
public class MementoImp implements BackupMemento,
        Memento {

    private int firstNumber;
    private int secondNumber;

    public MementoImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirst() {
        return firstNumber;
    }

    @Override
    public int getSecond() {
        return secondNumber;
    }
}