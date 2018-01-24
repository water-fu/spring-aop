package com.water.fu.framework.spring.aop;

import java.io.InputStream;
import java.util.List;

/**
 *
 * Created by fusj on 2018/1/24.
 */
public class AopTest {
    public static void main(String[] args) {
        InputStream config = AopTest.class.getClassLoader().getResourceAsStream("config.properties");
        BeanFactory beanFactory = new BeanFactory(config);

        List list = (List) beanFactory.getBean("bean");
        System.out.println(list.getClass().getName());
        list.add("123");
    }
}
