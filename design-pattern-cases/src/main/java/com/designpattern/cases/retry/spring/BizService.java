package com.designpattern.cases.retry.spring;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

import java.sql.SQLException;
import java.util.IllegalFormatException;

public interface BizService {

    @Retryable(value = {Exception.class},
            maxAttempts = 2, backoff = @Backoff(delay = 2000L, multiplier = 1.5))
    void doRetryAnyException(String arg);

    @Retryable(include = {IllegalArgumentException.class, IllegalStateException.class, IllegalFormatException.class, IndexOutOfBoundsException.class},
            maxAttempts = 2, backoff = @Backoff(delay = 2000L, multiplier = 1.5))
    void doRetryIncludeException(String arg);

    @Retryable(exclude = {InterruptedException.class, RuntimeException.class},
            maxAttempts = 2, backoff = @Backoff(delay = 2000L, multiplier = 1.5))
    void doRetryExcludeException(String arg);

    @Retryable(exceptionExpression = "#{message.contains('sorry')}",
            maxAttempts = 2, backoff = @Backoff(delay = 2000L, multiplier = 1.5))
    void doRetryExpressionException(String arg);

    @Retryable(value = {SQLException.class},
            maxAttempts = 2, backoff = @Backoff(delay = 2000L, multiplier = 1.5))
    void doRetrySQLException(String sql) throws SQLException;

    @Recover
    void recoverAnyException(Exception e, String arg);

    @Recover
    void recoverIllegalArgumentException(IllegalArgumentException e, String arg);

    @Recover
    void recoverIllegalStateException(IllegalStateException e, String arg);

    @Recover
    void recoverRuntimeException(RuntimeException e, String arg);

    @Recover
    void recoverSQLException(SQLException e, String sql);
}
