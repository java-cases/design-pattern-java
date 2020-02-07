package com.designpattern.gof.structural.composite;

/**
 *
 */
public abstract class Component {

    /**
     * Default constructor
     */
    public Component() {
    }

    /**
     * @param context
     */
    public void operation(Object context) {
        // TODO implement here
    }

    /**
     * @param component
     */
    public void add(Component component) {
        // TODO implement here
    }

    /**
     * @param component
     */
    public void remove(Component component) {
        // TODO implement here
    }

    public void getChild(int index) {
        // TODO implement here
    }

}