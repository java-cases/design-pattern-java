package com.designpattern.cases.retry.guava;

import com.github.rholder.retry.RetryException;
import com.github.rholder.retry.Retryer;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class RetryerBuildersTest {

    @Test
    public void buildRetryerIfAnyException() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerIfAnyException();

        try {
            retryer.call(() -> {
                System.out.println("--->throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerIfException() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerIfException();

        try {
            retryer.call(() -> {
                System.out.println("--->throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerIfRuntimeException() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerIfRuntimeException();

        try {
            retryer.call(() -> {
                System.out.println("--->throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerIfExceptionOfType() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerIfExceptionOfType();

        try {
            retryer.call(() -> {
                System.out.println("--->throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerIfResult() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerIfResult();

        try {
            retryer.call(() -> {
                System.out.println("--->return null");
                return null;
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerIfResultOrException() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerIfResultOrException();

        try {
            retryer.call(() -> {
                System.out.println("--->throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerFixedWait() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerFixedWait();

        try {
            retryer.call(() -> {
                System.out.println("--->throw new RuntimeException");
                throw new RuntimeException("sorry");
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerIncrementingWait() {
        Retryer<Boolean> retryer = RetryerBuilders.buildRetryerIncrementingWait();

        try {
            retryer.call(() -> {
                System.out.println("--->return null");
                return null;
            });
        } catch (ExecutionException | RetryException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buildRetryerWithRetryListener() {
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