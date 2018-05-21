package com.xiaopang.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static Logger logger = LogManager.getLogger(Test.class.getName());
    public static void main (String[] args) {
        logger.debug("创建的活动id："+111);
        logger.info("创建的活动id："+222);
        logger.warn("创建的活动id："+333);
        logger.error("创建的活动id："+444);
    }
    public static void test1(){
        logger.info("zsy===创建的活动id："+222);
    }
}
