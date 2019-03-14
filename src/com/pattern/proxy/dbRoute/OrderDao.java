package com.pattern.proxy.dbRoute;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:16
 * @Version 1.0
 */
public class OrderDao {

    public int insert(Order order) {
        System.out.println("插入成功");
        return 1;
    }

}
