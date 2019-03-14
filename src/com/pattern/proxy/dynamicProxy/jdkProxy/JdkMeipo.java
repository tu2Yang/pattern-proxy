package com.pattern.proxy.dynamicProxy.jdkProxy;

import com.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:40
 * @Version 1.0
 */
public class JdkMeipo implements InvocationHandler {

    // 拿到被代理对象的引用
    private Person target;

    public Object getInstance(Person person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        // 反射获取被代理对象所有的接口方法
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object obj = method.invoke(this.target, args);
        this.after();
        return obj;
    }

    private void before() {
        System.out.println("jdkMeipo before");
    }

    private void after() {
        System.out.println("jdkMeipo after");
    }

}
