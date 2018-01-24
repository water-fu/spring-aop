package com.water.fu.framework.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * Created by fusj on 2018/1/24.
 */
public class ProxyFactoryBean {
    private Object target;
    private Advice ad;

    public Object getProxy() {
        //利用Proxy类的静态方法newProxyInstance创建代理对象
        Object proxyobj = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler(){

                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        ad.beforeMethod(method);
                        Object obj = method.invoke(target, args);
                        ad.afterMethod(method);
                        return obj;
                    }
                }
        );
        return proxyobj;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public void setAd(Advice ad) {
        this.ad = ad;
    }
}
