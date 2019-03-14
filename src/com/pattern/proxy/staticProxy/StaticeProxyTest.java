package com.pattern.proxy.staticProxy;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:13
 * @Version 1.0
 */
public class StaticeProxyTest {

    public static void main(String[] args) {
        Mother mother = new Mother(new Son());

        mother.findLove();
    }

}
