package com.designpattern.gof.behavioral.memento;

/**
 *
 */
public class Originator {

    /**
     *
     */
    public Object state;

    /**
     * Default constructor
     */
    public Originator() {
    }

    /**
     * @param state
     */
    public void setState(Object state) {
        // TODO implement here
    }

    /**
     * @param memento
     */
    public void setMemento(Memento memento) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Memento createMemento() {
        // TODO implement here
        return null;
    }

    /**
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        // TODO implement here
    }

}