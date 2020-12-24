package com.atguigu.springcloud.myrole;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zuokun
 * @date 2020/12/24 13:58
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myrole(){
        // 负载均衡规则为随机定义
        return new RandomRule();
    }
}
