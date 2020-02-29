package com.designpattern.cases.retry.guava;

import com.github.rholder.retry.RetryException;
import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.google.common.base.Predicates;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Client {

    public static void main(String[] args) {
        retryCall();
    }

    private static void retryCall() {
        Retryer<Boolean> retryer = buildRetryer();

        try {
            retryer.call(() -> {
                System.out.println("throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Retryer<Boolean> buildRetryer() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfResult(Predicates.<Boolean>isNull())
                .retryIfExceptionOfType(IOException.class)
                .retryIfRuntimeException()
                .withStopStrategy(StopStrategies.stopAfterAttempt(3))
                .build();
    }
}
