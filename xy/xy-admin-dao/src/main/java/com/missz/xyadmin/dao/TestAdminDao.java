package com.missz.xyadmin.dao;

import com.missz.xyadmin.entity.TestAdminEntity;

public class TestAdminDao {
    public String dao(){
        TestAdminEntity testAdminEntity = new TestAdminEntity();
        return testAdminEntity.entity()+"我是Dao";
    }
}
