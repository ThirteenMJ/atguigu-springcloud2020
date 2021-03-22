package com.atguigu.springcloud.alibaba.serviceimpl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author thirteenmj
 * Date: 2021/3/21 16:27
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("storage-service:扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("storage-service:扣减库存结束");
    }
}
