## 生成器（Builder）

### Intent

将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

封装一个对象的构造过程，并允许按步骤构造。

### Class Diagram

要实现同样的构建过程可以创建不同的表现，那么一个自然的思路就是：
- Director：先把构建过程独立出来，在生成器模式中把它称为指导者Director，由它来指导装配过程，但是不负责每步具体的实现。
- Builder：光有指导者Director是不够的，必须要有能具体实现每步的对象，在生成器模式中称这些实现对象为生成器Builder。
- 指导者就是可以重用的构建过程，而生成器是可以被切换的具体实现。

### JDK

- [java.lang.StringBuilder](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
- [java.nio.ByteBuffer](http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html#put-byte-)
- [java.lang.StringBuffer](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-)
- [java.lang.Appendable](http://docs.oracle.com/javase/8/docs/api/java/lang/Appendable.html)
- [Apache Camel builders](https://github.com/apache/camel/tree/0e195428ee04531be27a0b659005e3aa8d159d23/camel-core/src/main/java/org/apache/camel/builder)