package com.designpattern.constructor.builderchain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserBuilder {
    private Long id;
    private String name;
    private Integer age;
    private List<String> girlfriends;

    public UserBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public UserBuilder girlfriend(String girlfriend) {
        if (this.girlfriends == null) {
            this.girlfriends = new ArrayList();
        }
        this.girlfriends.add(girlfriend);
        return this;
    }

    public UserBuilder girlfriends(Collection<? extends String> girlfriends) {
        if (this.girlfriends == null) {
            this.girlfriends = new ArrayList();
        }

        this.girlfriends.addAll(girlfriends);
        return this;
    }

    public UserBuilder clearGirlfriends() {
        if (this.girlfriends != null) {
            this.girlfriends.clear();
        }

        return this;
    }

    public User build() {
        return User.of(this.id, this.name, this.age, this.girlfriends);
    }
}