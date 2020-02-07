package com.designpattern.cases.constructor.singleton;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DoubleCheckedLockingTest {

    @Test
    public void getInstance() {
        assertNotNull(DoubleCheckedLocking.getInstance());
    }

    @Test
    public void getInstanceMultiThreads() throws ExecutionException, InterruptedException {
        Set<DoubleCheckedLocking> set = new HashSet<>();
        ExecutorService executor = new ScheduledThreadPoolExecutor(10);

        for (int i = 0; i < 1000; i++) {
            Future<DoubleCheckedLocking> futrue = executor.submit(() -> DoubleCheckedLocking.getInstance());
            set.add(futrue.get());
        }

        assertEquals(1, set.size());
    }
}