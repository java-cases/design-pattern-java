package com.designpattern.constructor.builderchain;

import java.util.List;

public class User {

    private Long id;
    private String name;
    private Integer age;
    private List<String> girlfriends;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getGirlfriends() {
        return girlfriends;
    }


    public User() {
    }

    private User(Long id, String name, Integer age, List<String> girlfriends) {
        if (name == null) {
            throw new NullPointerException("name is marked @NonNull but is null");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.girlfriends = girlfriends;
    }

    public static User of(Long id, String name, Integer age, List<String> girlfriends) {
        return new User(id, name, age, girlfriends);
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
