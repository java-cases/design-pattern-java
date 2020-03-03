package com.designpattern.gof.behavioral.observer;

import java.util.List;

/**
 *
 */
public class ConcreteSubject extends Subject {

    /**
     *
     */
    private List<Observer> observers;

    /**
     * Default constructor
     */
    public ConcreteSubject() {
    }

    /**
     * @param observer
     */
    public void register(Observer observer) {
        // TODO implement here
    }

    /**
     * @param observer
     */
    public void remove(Observer observer) {
        // TODO implement here
    }

    /**
     * @param context
     */
    public void notifyObserver(Object context) {
        // TODO implement here
    }

}