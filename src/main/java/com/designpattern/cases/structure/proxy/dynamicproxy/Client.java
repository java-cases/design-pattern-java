package com.designpattern.cases.structure.proxy.dynamicproxy;

import com.designpattern.cases.structure.proxy.IUserDao;
import com.designpattern.cases.structure.proxy.UserDao;

public class Client {

    public static void main(String[] args) {
        IUserDao userDao=new UserDao();
        userDao.save();
        userDao.update();

        System.out.println("。。。使用代理后。。。");
        ProxyFactory factory=new ProxyFactory(userDao);

        //Java的动态代理目前只能代理接口
        IUserDao proxy=(IUserDao)factory.getProxyInstance();
        proxy.save();
        proxy.update();
    }
}
