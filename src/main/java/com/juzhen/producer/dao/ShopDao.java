package com.juzhen.producer.dao;

import com.juzhen.producer.pojo.Shop;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @program: producer
 * @description: 获取店铺信息
 * @author: Mr.Ning
 * @create: 2018-11-29 15:35
 **/
@Component
public class ShopDao {
    @Resource
    private MongoTemplate mongoTemplate;

    public Shop getShop(){
        Pattern pattern = Pattern.compile("^.*气.*$",Pattern.CASE_INSENSITIVE);
        Query query = new Query(Criteria.where("category").regex(pattern));
        Shop shop = mongoTemplate.findOne(query,Shop.class);
        System.out.println(shop.getCategory());
        return shop;
    }
}
