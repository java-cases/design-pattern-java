## 中介者（Mediator）

### Intent

定义一个对象来封装一系列对象的交互。

中介者模式使各对象之间不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

### Class Diagram

- Mediator：中介者，定义一个接口用于与各同事（Colleague）对象通信。
- Colleague：同事，相关对象

使用中介者模式可以将复杂的依赖结构变成星形结构。

### Implementation

Alarm（闹钟）、CoffeePot（咖啡壶）、Monitor（监视器）、Sprinkler（喷头）是一组相关的对象，
在某个对象的事件产生时需要去操作其它对象

### JDK

- All scheduleXXX() methods of [java.util.Timer](http://docs.oracle.com/javase/8/docs/api/java/util/Timer.html)
- [java.util.concurrent.Executor#execute()](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-)
- submit() and invokeXXX() methods of [java.util.concurrent.ExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)
- scheduleXXX() methods of [java.util.concurrent.ScheduledExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html)
- [java.lang.reflect.Method#invoke()](http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-)