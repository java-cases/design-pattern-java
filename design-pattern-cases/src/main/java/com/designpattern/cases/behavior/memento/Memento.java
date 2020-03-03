package com.designpattern.cases.behavior.memento;

/**
 * Memento Interface to Originator
 *
 * This interface allows the originator to restore its state
 */
public interface Memento {
    int getFirst();
    int getSecond();
}