package com.atguigu.springcloud.alibaba.service;

import org.springframework.stereotype.Service;

/**
 * @author thirteenmj
 * Date: 2021/3/21 16:26
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
