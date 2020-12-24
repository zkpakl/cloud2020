package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zuokun
 * @date 2020/12/24 14:41
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeginMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeginMain80.class, args);
    }
}
