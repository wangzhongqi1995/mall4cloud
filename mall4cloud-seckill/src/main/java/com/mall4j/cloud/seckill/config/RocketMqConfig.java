package com.mall4j.cloud.seckill.config;

import com.mall4j.cloud.common.rocketmq.OnsMQTemplate;
import com.mall4j.cloud.common.rocketmq.OnsMQTransactionTemplate;
import com.mall4j.cloud.common.rocketmq.config.RocketMqAdapter;
import com.mall4j.cloud.common.rocketmq.config.RocketMqConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author FrozenWatermelon
 * @date 2021/3/30
 */
@RefreshScope
@Configuration
public class RocketMqConfig {

    @Autowired
    private RocketMqAdapter rocketMqAdapter;

    @Lazy
    @Bean(destroyMethod = "destroy")
    public OnsMQTemplate seckillOrderSubmitTemplate() {
        return rocketMqAdapter.getTemplateByTopicName(RocketMqConstant.SECKILL_ORDER_SUBMIT_TOPIC);
    }

    @Lazy
    @Bean(destroyMethod = "destroy")
    public OnsMQTransactionTemplate seckillOrderCreateTemplate() {
        OnsMQTransactionTemplate template = rocketMqAdapter.getTransactionTemplateByTopicName(RocketMqConstant.SECKILL_ORDER_CREATE_TOPIC);
        return template;
    }


}
