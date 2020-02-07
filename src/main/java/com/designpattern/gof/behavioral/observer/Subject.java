package com.designpattern.gof.behavioral.observer;

import java.util.Set;

/**
 *
 */
public abstract class Subject {

    /**
     *
     */
    public Set<Observer> observers;


    /**
     * Default constructor
     */
    public Subject() {
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