package com.itheima.service;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    public void serviceLogin() {
        System.out.println("service调用dao的登录方法...");
        userDao.daoLogin();
    }
}
