package com.designpattern.cases.constructor.cloneconstructor;

import java.util.Arrays;
import java.util.Objects;

public class CloneConstructor {

    private int x;
    private int y;
    private int[] items;

    //演示用，不要暴露内部引用类型数据
    public int[] getItems() {
        return items;
    }

    public int[] copyItems() {
        return Arrays.copyOf(items, items.length);
    }


    public CloneConstructor(int x, int y) {
        this.x = x;
        this.y = y;
        this.items = new int[]{x, y, x + y};
    }

    public CloneConstructor(CloneConstructor original) {

        // 拷贝构造函数
        this.x = original.x;
        this.y = original.y;

        this.items = new int[original.items.length];
        for (int i = 0; i < original.items.length; i++) {
            this.items[i] = original.items[i];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CloneConstructor that = (CloneConstructor) o;

        return this.x == that.x &&
                this.y == that.y &&
                Arrays.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(this.x, this.y);
        result = 31 * result + Arrays.hashCode(this.items);
        return result;
    }
}
