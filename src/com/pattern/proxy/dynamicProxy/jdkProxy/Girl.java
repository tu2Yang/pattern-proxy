package com.pattern.proxy.dynamicProxy.jdkProxy;

import com.pattern.proxy.Person;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:39
 * @Version 1.0
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("要求：男的");
    }
}
