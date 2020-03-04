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
public class BizServiceImplTest {

    @Autowired
    private BizService retryService;


    @Test
    public void doRetryAnyException() {
        retryService.doRetryAnyException("doRetryAnyException");
    }

    @Test
    public void doRetryIncludeException() {
        retryService.doRetryIncludeException("doRetryIncludeException");
    }

    @Test
    public void doRetryExcludeException() {
        retryService.doRetryExcludeException("doRetryExcludeException");
    }

    @Test
    public void doRetryExpressionException() {
        retryService.doRetryExpressionException("doRetryExpressionException");
    }

    @Test
    public void doRetrySQLException() {
        try {
            retryService.doRetrySQLException("select * from user");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}