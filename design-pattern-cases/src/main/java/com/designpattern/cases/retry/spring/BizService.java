package com.designpattern.cases.retry.spring;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

import java.sql.SQLException;

public interface BizService {

    @Retryable(value = {SQLException.class}, maxAttempts = 2, backoff = @Backoff(delay = 2000L, multiplier = 1.5))
    void retrySql(String sql) throws SQLException;

    @Recover
    void recover(SQLException e, String sql);
}
