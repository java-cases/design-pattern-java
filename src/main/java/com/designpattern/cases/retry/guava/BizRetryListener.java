package com.designpattern.cases.retry.guava;

import com.github.rholder.retry.Attempt;
import com.github.rholder.retry.RetryListener;

public class BizRetryListener implements RetryListener {

    @Override
    public <V> void onRetry(Attempt<V> attempt) {
        System.out.println("hasException=" + attempt.hasException());
        System.out.println("hasResult=" + attempt.hasResult());

        System.out.println("getAttemptNumber=" + attempt.getAttemptNumber());
        System.out.println("getDelaySinceFirstAttempt=" + attempt.getDelaySinceFirstAttempt());

        if (attempt.hasException()) {
            System.out.println("getExceptionCause=" + attempt.getExceptionCause().toString());
        } else {
            System.out.println("getResult=" + attempt.getResult());
        }
    }
}
