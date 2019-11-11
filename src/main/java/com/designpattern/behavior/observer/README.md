## 观察者（Observer）

### Intent

定义对象之间的一种一对多依赖关系，使得每当一个对象状态发生改变时其相关依赖对象皆得到通知并被自动更新。

主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。

### Class Diagram

- 主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。
- 观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。

### Implementation

天气数据布告板会在天气信息发生改变时更新其内容，布告板有多个，并且在将来会继续增加。

### JDK

- [java.util.Observer](http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html)
- [java.util.EventListener](http://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html)
- [javax.servlet.http.HttpSessionBindingListener](http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionBindingListener.html)
- [RxJava](https://github.com/ReactiveX/RxJava)