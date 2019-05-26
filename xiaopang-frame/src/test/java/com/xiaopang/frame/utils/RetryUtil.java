package com.xiaopang.frame.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 方法重试没有终止机制，只是重试次数，所以存在问题
 * @deprecated
 */
public class RetryUtil {
    private static ThreadLocal<Integer> retryTimesThread = new ThreadLocal<Integer>();

    /**设置当前方法重试次数
     * @param retryTimes
     * @return
     */
    public static RetryUtil setRetryTimes (Integer retryTimes) {
        if (retryTimesThread.get() == null ) {
            retryTimesThread.set(retryTimes);
        }
        return new RetryUtil();
    }

    /**
     * 重试当前方法，按顺序传入调用者的所有参数
     * @param args
     * @return
     */
    public Object retry(Object... args) {
        try {
            Integer retryTimes = retryTimesThread.get();
            if (retryTimes <=0 ){
                retryTimesThread.remove();
                return null;
            }
            retryTimesThread.set(--retryTimes);
            String upperClassName = Thread.currentThread().getStackTrace()[2].getClassName();
            String upperMethodName = Thread.currentThread().getStackTrace()[2].getMethodName();

            Class clazz = Class.forName(upperClassName);
            Object targetObject = clazz.newInstance();
            Method targetMethod = null;
            for (Method method:clazz.getDeclaredMethods()) {
                if (method.getName().equals(upperMethodName)) {
                    targetMethod = method;
                    break;
                }
            }
            if (targetMethod == null) {
                return null;
            }
            targetMethod.setAccessible(true);
            return targetMethod.invoke(targetObject ,args);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
