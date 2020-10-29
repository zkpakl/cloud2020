package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    //写
    public int Create(Payment payment);

    //读
    public Payment getPaymentById(@Param("id") Long id);
}
