package com.ben.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.ben.common.domain.Product;
import com.ben.common.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ProductServiceImpl implements IProductService {
    Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public Product getById() {
        Product p = new Product(1, "彩电");
        logger.info("get product : " + JSON.toJSONString(p));
        return p;
    }
}
