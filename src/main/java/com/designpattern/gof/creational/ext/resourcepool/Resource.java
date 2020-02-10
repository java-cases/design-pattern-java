package com.designpattern.gof.creational.ext.resourcepool;

/**
 *
 */
public class Resource {

    public Resource() {
    }

    public void operation() {
        System.out.println("Resource.operation(), hashCode:" + this.toString());
    }

}