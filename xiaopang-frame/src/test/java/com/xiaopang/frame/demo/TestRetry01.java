package com.xiaopang.frame.demo;

import com.xiaopang.frame.utils.RetryUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class TestRetry01 {
    private Logger log = LogManager.getLogger(TestRetry01.class);
    @Test
    public void mainMethod(){
        subMethod("123","456");
    }

    public void subMethod(String param1,String param2){
        log.info("zsy===subMethod");
//        RetryUtil.setRetryTimes(3).retry(param1,param2);
    }
}
