package com.juzhen.producer.producer;

import com.juzhen.producer.pojo.Shop;
import com.juzhen.producer.service.ShopService;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @program: producer
 * @description: 店铺的消息队列
 * @author: Mr.Ning
 * @create: 2018-11-29 15:39
 **/
@Component
public class ShopProducer {
    @Resource
    ShopService shopService;

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void getShop(){
//        rabbitTemplate.convertAndSend("exchang_shop", "key.*", shopService.getShop(), new CorrelationData(UUID.randomUUID().toString()) );
        rabbitTemplate.convertAndSend("exchang_shop2", "", shopService.getShop(), new CorrelationData(UUID.randomUUID().toString()) );
    }
}
