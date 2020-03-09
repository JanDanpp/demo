package com.missz.xyshop.controller;

import com.missz.xyshop.entity.ShopEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestShop {

    @ResponseBody
    @RequestMapping(value = "/web")
    public String shop(){
        ShopEntity shopEntity = new ShopEntity();
        return shopEntity.entity()+"我是TestShop";
    }
}
