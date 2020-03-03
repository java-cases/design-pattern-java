package com.designpattern.cases.structure.proxy;

/**
 * RealSubject
 */
public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("保存数据");
    }

    @Override
    public void update() {
        System.out.println("更新数据");
    }
}
