package com.water.fu.framework.spring.aop;

import java.lang.reflect.Method;

/**
 * 默认切面响应
 * Created by fusj on 2018/1/24.
 */
public class DefaultAdvice implements Advice {
    @Override
    public void beforeMethod(Method method) {
        System.out.println("before execute");
    }

    @Override
    public void afterMethod(Method method) {
        System.out.println("after execute");
    }
}
