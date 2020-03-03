## 迭代器（Iterator）

### Intent

提供一种方法，顺序访问一个聚合对象中的各个元素，而又不用暴露该对象的内部表示。

### Class Diagram

- Aggregate: 是聚合类，其中 createIterator() 方法可以产生一个 Iterator；

- Iterator: 主要定义了 hasNext() 和 next() 方法。

- Client: 组合了 Aggregate，为了迭代遍历 Aggregate，也需要组合 Iterator。

### Implementation

NA

### JDK

- [java.util.Iterator](http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)
- [java.util.Enumeration](http://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html)
