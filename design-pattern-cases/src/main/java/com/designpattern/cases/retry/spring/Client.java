package com.designpattern.cases.retry.spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

public class Client {

    @Autowired
    private BizService retryService;

    public void retry() {
        try {
            retryService.retrySql("select * from user");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
