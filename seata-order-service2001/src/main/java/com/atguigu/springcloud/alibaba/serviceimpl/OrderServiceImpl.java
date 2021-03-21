package com.atguigu.springcloud.alibaba.serviceimpl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountSerice;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author thirteenmj
 * Date: 2021/3/21 12:27
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountSerice accountSerice;
    @Resource
    private StorageService storageService;

    @Override
    public void create(Order order) {
        //1、新建订单
        log.info("开始新建订单");
        orderDao.create(order);
        //2、扣减库存
        log.info("订单微服务开始调用库存，做扣减storage-start");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("订单微服务开始调用库存，做扣减storage-end");
        //3、扣减账户
        log.info("订单微服务开始调用账户，做扣减Money");
        accountSerice.decrease(order.getUserId(), order.getMoney());
        log.info("订单微服务开始调用账户，做扣减Money-end");

        //4、修改订单状态，从0到1，1代表已经完成
        log.info("修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("修改订单状态结束");

        log.info("下订单结束，哈哈哈");
    }

    @Override
    public void update(Long userId, Integer status) {

    }
}
