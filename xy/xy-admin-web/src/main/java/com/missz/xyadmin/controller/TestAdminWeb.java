package com.missz.xyadmin.controller;

import com.missz.xyadmin.service.TestAdminSercive;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAdminWeb {

    @ResponseBody
    @RequestMapping(value = "/aweb")
    public String web(){
        TestAdminSercive testAdminSercive = new TestAdminSercive();
        return testAdminSercive.service()+"我是AdminWeb";
    }
}
