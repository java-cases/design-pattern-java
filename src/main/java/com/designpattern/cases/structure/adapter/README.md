## 适配器（Adapter）

### Intent

将一个类的接口转换成客户希望的另一个接口。适配器模式让那些接口不兼容的类可以一起工作。

### Class Diagram

- Target：定义客户端需要的跟特定领域相关的接口。

- Adaptee：已经存在的接口，通常能满足客户端的功能要求，但是接口与客户端要求的特定领域接口不一致，需要被适配。

- Adapter：适配器，把Adaptee适配成为Client需要的Target。

### Implementation

美国的电饭煲是在电压为 110V 下工作，而中国的电饭煲在电压 220V 下工作。要求将在美国使用的电饭煲适配成能在中国使用。

### JDK

- [java.util.Arrays#asList()](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList%28T...%29)
- [java.util.Collections#list()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-)
- [java.util.Collections#enumeration()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-)
- [javax.xml.bind.annotation.adapters.XMLAdapter](http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#marshal-BoundType-)