package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author zuokun
 * @date 2020/12/27 20:23
 */
@Service
public class PaymentService {

    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"pamentInfo_OK,id: "+id+"\t"+"O(∩_∩)O哈哈~";
    }

    /**
     * 访问超时
     * @return
     */
    public String paymentInfo_TimeOut(Integer id){
        int interTime = 3;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_Timeout，id:" + id + "耗时" + interTime + "秒钟--";
    }
}
