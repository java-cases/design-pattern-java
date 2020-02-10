package com.designpattern.gof.creational.ext.resourcepool;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ResourcePool {

    private List<Resource> pool = new ArrayList<>(10);

    public ResourcePool() {
    }

    /**
     * @return
     */
    public Resource acquire() {
        if (pool.size() <= 0) {
            Resource resource = new Resource();
            return resource;
        }

        return pool.remove(0);
    }

    /**
     * @param resource
     * @return
     */
    public void release(Resource resource) {
        pool.add(resource);
    }

}