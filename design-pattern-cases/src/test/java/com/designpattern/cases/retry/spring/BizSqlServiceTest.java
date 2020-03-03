package com.designpattern.cases.retry.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = DEFINED_PORT)
public class BizSqlServiceTest {

    @Autowired
    private BizService retryService;

    @Test
    public void retrySql() {
        try {
            retryService.retrySql("select * from user");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}