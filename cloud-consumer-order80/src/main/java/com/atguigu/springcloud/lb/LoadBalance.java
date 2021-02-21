package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: thirteenmj
 * @Date: 2021/2/14 23:02
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
