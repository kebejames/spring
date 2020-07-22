package com.itheima.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public void daoLogin() {
        System.out.println("用户登录完毕..");
    }
}
