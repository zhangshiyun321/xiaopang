package com.xiaopang.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static Logger logger = LogManager.getLogger(Test.class.getName());
    public static void main (String[] args) {
        logger.info("zsy===web===Test===111");
        com.xiaopang.common.Test.test1();
    }
}
