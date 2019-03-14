package com.pattern.proxy.staticProxy;

import com.pattern.proxy.Person;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:09
 * @Version 1.0
 */
public class Mother {

    private Person person;

    public Mother(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("母亲111");
        this.person.findLove();
        System.out.println("母亲222");
    }

}
