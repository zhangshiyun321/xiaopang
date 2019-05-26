package com.xiaopang.frame.service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RemoteService {

    private Logger log = LogManager.getLogger(RemoteService.class);

    @Retryable(value = RuntimeException.class, maxAttempts = 3, backoff = @Backoff(delay = 5000L, multiplier = 2))
    public void call () {
        log.info("do somethings ...");
        throw new RuntimeException("RPC 调用异常");
    }

    @Recover
    public void recover (RuntimeException re) {
        log.info("we meet some error and begin to recover something ...");
        log.error("recover exception...");
    }
}
