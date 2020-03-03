package com.designpattern.cases.retry.guava;

import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.github.rholder.retry.WaitStrategies;
import com.google.common.base.Predicates;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RetryerBuilders {
    private static final int ATTEMPT_NUMBERS = 3;

    private static final TimeUnit WAIT_TIME_UNIT = TimeUnit.SECONDS;
    private static final long WAIT_TIME = 1;
    private static final long WAIT_INCREMENT_TIME = 1;

    private RetryerBuilders() {
    }

    public static Retryer<Boolean> buildRetryerIfAnyException() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfException()
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerIfException() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfException(e -> e instanceof IOException || e instanceof RuntimeException)
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerIfRuntimeException() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfRuntimeException()
                .retryIfException(e -> e instanceof InterruptedException)
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerIfExceptionOfType() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfExceptionOfType(IOException.class)
                .retryIfException(e -> e instanceof InterruptedException)
                .retryIfRuntimeException()
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerIfResult() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfResult(Predicates.<Boolean>isNull())
                .retryIfExceptionOfType(IOException.class)
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerIfResultOrException() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfResult(Predicates.<Boolean>isNull())
                .retryIfException()
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerFixedWait() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfResult(Predicates.<Boolean>isNull())
                .retryIfExceptionOfType(IOException.class)
                .retryIfRuntimeException()
                .withWaitStrategy(WaitStrategies.fixedWait(WAIT_TIME, WAIT_TIME_UNIT))
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerIncrementingWait() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfResult(Predicates.<Boolean>isNull())
                .retryIfExceptionOfType(IOException.class)
                .retryIfRuntimeException()
                .withWaitStrategy(WaitStrategies.incrementingWait(WAIT_TIME, WAIT_TIME_UNIT, WAIT_INCREMENT_TIME, WAIT_TIME_UNIT))
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .build();
    }

    public static Retryer<Boolean> buildRetryerWithRetryListener() {
        return RetryerBuilder.<Boolean>newBuilder()
                .retryIfResult(Predicates.<Boolean>isNull())
                .retryIfExceptionOfType(IOException.class)
                .retryIfRuntimeException()
                .withWaitStrategy(WaitStrategies.incrementingWait(WAIT_TIME, WAIT_TIME_UNIT, WAIT_INCREMENT_TIME, WAIT_TIME_UNIT))
                .withStopStrategy(StopStrategies.stopAfterAttempt(ATTEMPT_NUMBERS))
                .withRetryListener(new BizRetryListener())
                .build();
    }
}
