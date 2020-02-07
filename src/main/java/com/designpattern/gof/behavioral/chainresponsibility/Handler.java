package com.designpattern.gof.behavioral.chainresponsibility;

/**
 *
 */
public abstract class Handler {

    /**
     * Default constructor
     */
    public Handler() {
    }


    /**
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        // TODO implement here
    }

    /**
     * @param context
     */
    public void handle(Object context) {
        // TODO implement here
    }

}