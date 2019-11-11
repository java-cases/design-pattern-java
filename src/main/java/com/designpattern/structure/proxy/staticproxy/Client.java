package com.designpattern.structure.proxy.staticproxy;

import com.designpattern.structure.proxy.UserDao;

public class Client {

    public static void main(String[] args) {
        UserDao userDao=new UserDao();
        userDao.save();

        System.out.println("。。。使用代理后。。。");

        UserDaoProxy proxy=new UserDaoProxy(userDao);
        proxy.save();
    }
}