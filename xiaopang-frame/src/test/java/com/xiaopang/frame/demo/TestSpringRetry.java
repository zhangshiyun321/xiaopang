package com.xiaopang.frame.demo;

import com.xiaopang.frame.service.RemoteService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestSpringRetry {
    @Autowired
    public RemoteService remoteService = new RemoteService();
    @Test
    public void testSpringRetry() {
        remoteService.call();
    }
}
