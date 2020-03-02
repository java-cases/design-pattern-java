package com.designpattern.cases.retry.guava;

import com.github.rholder.retry.RetryException;
import com.github.rholder.retry.Retryer;

import java.util.concurrent.ExecutionException;

public class Client {

    public static void main(String[] args) {
        buildRetryerWithRetryListener();
    }

    private static void buildRetryerWithRetryListener() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerWithRetryListener();

        try {
            retryer.call(() -> {
                System.out.println("--->throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

}
