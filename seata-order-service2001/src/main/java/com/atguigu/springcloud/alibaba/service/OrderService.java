package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;
import feign.Param;

/**
 * @author thirteenmj
 * Date: 2021/3/21 11:55
 */
public interface OrderService {
    //1、新建订单
    void create(Order order);

    //2、修改订单状态,从零改为1
    void update(@Param("userId")Long userId, @Param("status") Integer status);

}
