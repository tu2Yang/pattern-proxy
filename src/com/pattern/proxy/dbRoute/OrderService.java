package com.pattern.proxy.dbRoute;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:17
 * @Version 1.0
 */
public class OrderService implements IOrderService {

    @Override
    public int createOrder(Order order) {
        System.out.println("创建订单service");
        OrderDao dao = new OrderDao();
        dao.insert(order);
        return 0;
    }
}
