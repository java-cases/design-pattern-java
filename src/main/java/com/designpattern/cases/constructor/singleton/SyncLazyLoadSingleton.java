package com.designpattern.cases.constructor.singleton;

public class SyncLazyLoadSingleton {

    private static SyncLazyLoadSingleton uniqueInstance;

    private SyncLazyLoadSingleton(){

    }

    public  synchronized static SyncLazyLoadSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SyncLazyLoadSingleton();
        }
        return uniqueInstance;
    }
}
