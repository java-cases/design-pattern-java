package com.designpattern.cases.retry.spring;

import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class BizServiceImpl implements BizService {

    @Override
    public void doRetryAnyException(String arg) {
        System.out.println("--->throw new RuntimeException");
        throw new RuntimeException("sorry from RuntimeException");
    }

    @Override
    public void doRetryIncludeException(String arg) {
        System.out.println("--->throw new IllegalArgumentException");
        throw new IllegalArgumentException("sorry from IllegalArgumentException");
    }

    @Override
    public void doRetryExcludeException(String arg) {
        System.out.println("--->throw new RuntimeException");
        throw new RuntimeException("sorry from RuntimeException");
    }

    @Override
    public void doRetryExpressionException(String arg) {
        System.out.println("--->throw new IllegalStateException");
        throw new IllegalStateException("sorry");
    }

    @Override
    public void doRetrySQLException(String sql) throws SQLException {
        System.out.println("--->throw new SQLException");
        throw new SQLException("sorry from SQLException");
    }

    @Override
    public void recoverAnyException(Exception e, String arg) {
        System.out.println("recover from Any Exception. arg: : " + arg + ", e.getMessage: " + e.getMessage());
    }

    @Override
    public void recoverIllegalArgumentException(IllegalArgumentException e, String arg) {
        System.out.println("recover from IllegalArgumentException. arg: " + arg + ", e.getMessage: " + e.getMessage());
    }

    @Override
    public void recoverIllegalStateException(IllegalStateException e, String arg) {
        System.out.println("recover from IllegalStateException. arg: " + arg + ", e.getMessage: " + e.getMessage());
    }

    @Override
    public void recoverRuntimeException(RuntimeException e, String arg) {
        System.out.println("recover from RuntimeException. arg: " + arg + ", e.getMessage: " + e.getMessage());
    }

    @Override
    public void recoverSQLException(SQLException e, String sql) {
        System.out.println("recover from SQLException. arg: " + sql + ", e.getMessage: " + e.getMessage());
    }
}
