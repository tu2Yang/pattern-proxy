package com.pattern.proxy.dynamicProxy.jdkProxy;

import com.pattern.proxy.Person;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:43
 * @Version 1.0
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Person person = (Person) new JdkMeipo().getInstance(new Girl());
            person.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
