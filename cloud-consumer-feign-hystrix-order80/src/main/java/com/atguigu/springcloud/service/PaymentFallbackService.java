package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: thirteenmj
 * @Date: 2021/2/16 15:45
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK,呜呜呜";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_Timeout,呜呜呜";
    }
}
