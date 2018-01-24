package com.water.fu.framework.spring.aop;

import java.lang.reflect.Method;

/**
 * 切面响应
 * Created by fusj on 2018/1/24.
 */
public interface Advice {
    void beforeMethod(Method method);

    void afterMethod(Method method);
}
