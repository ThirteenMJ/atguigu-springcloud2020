package com.atguigu.springcloud.controller;

import io.netty.util.Timeout;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: thirteenmj
 * @Date: 2021/2/28 19:31
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
//        try {
//            TimeUnit.MILLISECONDS.sleep(800);
//            Thread.currentThread();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + ",---testB");
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        //暂停几秒线程
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测试RT");
        log.info("testD 异常比例");
        int age = 10 / 0;
        return "-----testD";
    }

    @GetMapping("/testE")
    public String testE()
    {
        log.info("testE 测试异常数");
        int age = 10/0;
        return "------testE 测试异常数";
    }

}
