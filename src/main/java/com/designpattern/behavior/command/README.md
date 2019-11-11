## 命令（Command）

### Intent

将一个请求封装为一个对象，从而可用不同的请求对客户进行参数化，对请求排队或者记录请求日志，以及支持可撤销的操作。

将命令封装成对象中，具有以下作用：
- 使用命令来参数化其它对象
- 将命令放入队列中进行排队
- 将命令的操作记录到日志中
- 支持可撤销的操作

### Class Diagram

- Command：命令

- Receiver：命令接收者，也就是命令真正的执行者

- Invoker：通过它来调用命令

- Client：可以设置命令与命令的接收者

### Implementation

NA

### JDK

- [java.lang.Runnable](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
- [Netflix Hystrix](https://github.com/Netflix/Hystrix/wiki)
- [javax.swing.Action](http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html)