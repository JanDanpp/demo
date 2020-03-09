package com.missz.xyadmin.service;

import com.missz.xyadmin.dao.TestAdminDao;

public class TestAdminSercive {
    public String service(){
        TestAdminDao testAdminDao = new TestAdminDao();
        return testAdminDao.dao()+"我是Sercive";
    }
}
