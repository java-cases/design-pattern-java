## 策略（Strategy）

### Intent

定义一系列算法，将每一个算法封装起来，并让它们可以相互替换。
策略模式让算法可以独立于使用它的客户而变化。

### Class Diagram

- Strategy 接口定义了一个算法族，它们都实现了  behavior() 方法。
- Context 是使用到该算法族的类，其中的 doSomething() 方法会调用 behavior()，
setStrategy(Strategy) 方法可以动态地改变 strategy 对象，也就是说能动态地改变 Context 所使用的算法。

### 与状态模式的比较

状态模式的类图和策略模式类似，并且都是能够动态改变对象的行为。

- 状态模式：是通过状态转移来改变 Context 所组合的 State 对象。状态模式主要是用来解决状态转移的问题，当状态发生转移了，那么 Context 对象就会改变它的行为。
- 策略模式：是通过 Context 本身的决策来改变组合的 Strategy 对象。而策略模式主要是用来封装一组可以互相替代的算法族，并且可以根据需要动态地去替换 Context 使用的算法。

所谓的状态转移，是指 Context 在运行过程中由于一些条件发生改变而使得 State 对象发生改变，注意必须要是在运行过程中。

### Implementation

报价管理：向客户报价，对于销售部门的人来讲，这是一个非常重大、非常复杂的问题，对不同的客户要报不同的价格，比如：
1. 对普通客户或者是新客户报的是全价
2. 对老客户报的价格，根据客户年限，给予一定的折扣
3. 对大客户报的价格，根据大客户的累计消费金额，给予一定的折扣

### JDK

- java.util.Comparator#compare()
- javax.servlet.http.HttpServlet
- javax.servlet.Filter#doFilter()