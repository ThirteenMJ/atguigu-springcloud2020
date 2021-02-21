package com.atguigu.springcloud.service;

import com.atguigu.springcloud.enties.Payment;

/**
 * @author 马健
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
