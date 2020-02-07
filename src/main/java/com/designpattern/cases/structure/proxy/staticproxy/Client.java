package com.designpattern.cases.structure.proxy.staticproxy;

import com.designpattern.cases.structure.proxy.UserDao;

public class Client {

    public static void main(String[] args) {
        UserDao userDao=new UserDao();
        userDao.save();

        System.out.println("。。。使用代理后。。。");

        UserDaoProxy proxy=new UserDaoProxy(userDao);
        proxy.save();
    }
}