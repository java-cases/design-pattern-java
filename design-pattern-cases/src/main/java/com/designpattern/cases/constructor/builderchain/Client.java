package com.designpattern.cases.constructor.builderchain;

public class Client {

    public static void main(String[] args) {
        User user=createUserWithBuilder();
        System.out.println(user);
    }

    public static User createUserWithBuilder() {
        return User.builder().id(100L).name("ken").build();
    }
}
