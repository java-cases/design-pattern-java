package com.designpattern.behavior.memento;

/**
 * Originator Interface
 */
public interface Calculator {

    // Create Memento
    BackupMemento backup();

    // setMemento
    void restore(BackupMemento memento);

    int calc();

    void setFirst(int firstNumber);

    void setSecond(int secondNumber);
}
