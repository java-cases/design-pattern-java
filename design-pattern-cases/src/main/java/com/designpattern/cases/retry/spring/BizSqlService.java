package com.designpattern.cases.retry.spring;

import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class BizSqlService implements BizService {

    @Override
    public void retrySql(String sql) throws SQLException {
        System.out.println("--->throw new SQLException");
        throw new SQLException("sorry from sql");
    }

    @Override
    public void recover(SQLException e, String sql) {
        System.out.println("recover from SQLException: " + e.getMessage());
    }
}
