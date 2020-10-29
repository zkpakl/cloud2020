package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override

    //写入数据
    public int Create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    //读取数据
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
