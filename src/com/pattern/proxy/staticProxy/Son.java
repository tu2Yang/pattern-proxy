package com.pattern.proxy.staticProxy;

import com.pattern.proxy.Person;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:10
 * @Version 1.0
 */
public class Son implements Person {

    @Override
    public void findLove() {
        System.out.println("我要找对象");
    }
}
