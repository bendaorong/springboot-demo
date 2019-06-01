package com.ben.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ben.common.domain.Product;
import com.ben.common.service.IProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Reference
    private IProductService iProductService;

    @RequestMapping("/getProduct")
    public Product getProduct() throws Exception {
        if(true){
            throw new Exception("aaa");
        }
        return iProductService.getById();
    }
}
