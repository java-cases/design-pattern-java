package com.designpattern.cases.constructor.cloneconstructor;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CloneConstructorTest {

    @Test
    public void cloneConstructor() {
        CloneConstructor original=new CloneConstructor(1,2);
        CloneConstructor clone=new CloneConstructor(original);

        assertTrue(clone != original);

        assertTrue(clone.equals(original));
        assertEquals(original, clone);

        assertTrue(clone.getItems() != original.getItems());

        clone.getItems()[0] = -1;
        System.out.println(Arrays.toString(original.getItems()));
        System.out.println(Arrays.toString(clone.getItems()));

        assertTrue(clone.getItems()[0] != original.getItems()[0]);
    }
}