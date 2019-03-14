package com.pattern.proxy.dbRoute.proxy;

import com.pattern.proxy.dbRoute.IOrderService;
import com.pattern.proxy.dbRoute.Order;
import com.pattern.proxy.dbRoute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:24
 * @Version 1.0
 */
public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(sdf.format(new Date(time)));
        DynamicDataSourceEntity.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return 0;
    }

}
