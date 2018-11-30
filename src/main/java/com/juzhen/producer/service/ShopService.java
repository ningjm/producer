package com.juzhen.producer.service;

import com.juzhen.producer.dao.ShopDao;
import com.juzhen.producer.pojo.Shop;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: producer
 * @description: 获取店铺信息
 * @author: Mr.Ning
 * @create: 2018-11-29 15:37
 **/

@Service
public class ShopService {
    @Resource
    private ShopDao shopDao;
    public Shop getShop(){
       return shopDao.getShop();
    }
}
