## 责任链（Chain Of Responsibility）

### Intent

避免将一个请求的发送者与接收者耦合在一起，让多个对象都有机会处理请求。
将接收请求的对象连接成一条链，并且沿着这条链传递请求，直到有一个对象能够处理它为止。

### Class Diagram

Handler：定义处理请求的接口，并且实现后继链（successor）

### Implementation

- 职责链模式会定义一个所有处理请求的对象都要继承实现的抽象类Handler，这样就有利于随时切换新的实现；
- 其次，每个处理请求对象只实现业务流程中的一步业务处理，这样使其变得简单；
- 最后，职责链模式会动态的来组合这些处理请求的对象，把它们按照流程动态组合起来，并要求它们依次调用，这样就动态的实现了流程。

### JDK

- [java.util.logging.Logger#log()](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log%28java.util.logging.Level,%20java.lang.String%29)
- [Apache Commons Chain](https://commons.apache.org/proper/commons-chain/index.html)
- [javax.servlet.Filter#doFilter()](http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-)