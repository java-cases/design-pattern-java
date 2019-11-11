package com.designpattern.constructor.builderchain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserTest {

    private User buildUser() {
        return User.builder()
                .id(1L)
                .age(20)
                .name("sam")
                .girlfriend("susan")
                .build();
    }

    @Test
    public void toStringOfUser() {
        User user = buildUser();
        System.out.println(user.toString());
    }

    @Test
    public void hashCodeOfUser() {
        User user = buildUser();
        System.out.println(user.hashCode());
    }

    @Test
    public void builder() {
        User user = buildUser();

        assertEquals(true, user.getId() == 1L);
        assertEquals(Integer.valueOf(20), user.getAge());
        assertEquals("sam", user.getName());
    }

    @Test(expected = NullPointerException.class)
    public void notNull() {
        User.builder()
                .id(1L)
                .age(20)
                .name(null)
                .build();
    }

    @Test()
    public void singular() {
        List<String> girlfriends = buildUser().getGirlfriends();

        assertNotNull(girlfriends);
        assertEquals("susan", girlfriends.get(0));
    }

    @Test()
    public void singularList() {
        User user = User.builder()
                .id(1L)
                .age(20)
                .name("sam")
                .girlfriends(Arrays.asList("susan", "kate"))
                .build();

        List<String> girlfriends = user.getGirlfriends();

        assertNotNull(girlfriends);
        assertEquals(2, girlfriends.size());
        assertEquals("susan", girlfriends.get(0));
        assertEquals("kate", girlfriends.get(1));
    }

}