## 适配器（Adapter）

### Intent

将抽象部分与它的实现部分解耦，使得两者都能够独立变化。

### Class Diagram

- Abstraction：定义抽象类的接口
- Implementor：定义实现类接口

### Implementation

- RemoteControl 表示遥控器，指代 Abstraction。
- TV 表示电视，指代 Implementor。

桥接模式将遥控器和电视分离开来，从而可以独立改变遥控器或者电视的实现。

### JDK

- AWT (It provides an abstraction layer which maps onto the native OS the windowing support.)
- JDBC