package com.designpattern.cases.behavior.memento.serializable;

import java.io.Serializable;

public class User implements Serializable {

    private String userName;
    transient private String password;
    private String addr;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}