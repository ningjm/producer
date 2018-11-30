package com.juzhen.producer.controller;

import com.juzhen.producer.pojo.Shop;
import com.juzhen.producer.producer.ShopProducer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: producer
 * @description: 获取店铺信息
 * @author: Mr.Ning
 * @create: 2018-11-29 15:41
 **/

@RestController
public class ShopController {
    @Resource
    private ShopProducer shopProducer;

    @RequestMapping("/get_shop")
    public void getShop(){
        shopProducer.getShop();
    }
}
