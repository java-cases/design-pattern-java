package com.designpattern.gof.creational.ext.resourcepool;

public class Client {

    public static void main(String[] args) {
        ResourcePool pool = new ResourcePool();

        Resource resource1 = pool.acquire();
        resource1.operation();

        pool.release(resource1);

        Resource resource2 = pool.acquire();
        resource2.operation();

        Resource resource3 = pool.acquire();
        resource3.operation();
    }

}