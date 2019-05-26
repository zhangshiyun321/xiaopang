package com.xiaopang.frame.service;
import com.xiaopang.frame.model.CbTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * <p> 重试次数的服务 </p>
 * @author houbinbin
 * @version 1.0
 * @since JDK 1.7
 */
@Service
public class TimeService {

    private static final Logger log = LogManager.getLogger(TimeService.class);

    /**
     * 调用方法
     */
    @Retryable(value = RuntimeException.class,maxAttempts = 5, backoff = @Backoff(delay = 2000L, multiplier = 1.5))
    public void call(CbTime cbTime) {
        log.info("Call " + cbTime);
        cbTime.setTime(cbTime.getTime() + 1);
        throw new RuntimeException();
    }

    /**
     * 补偿机制
     * @param e 异常
     */
    @Recover
    public void recover(RuntimeException e, CbTime cbTime) {
        log.info("开始处理回复工作: " + cbTime);
        log.warn("We meet ex: ", e);
    }

}
