## 单例（Singleton）

### Intent

确保一个类只有一个实例，并提供一个全局的访问点来访间这个唯一的实例。

### Class Diagram

使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。
私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。

### Implementation

- 延迟加载的思想：
  就是一开始不要加载资源或者数据，一直等，等到马上就要使用这个资源或者数据了，
  躲不过去了才加载，所以也称Lazy Load。不是懒惰啊，是“延迟加载”，这在实际开发中是一种很常见的思想，尽可能的节约资源。

- 缓存的思想：
  把这些数据缓存到内存里面，每次操作的时候，先到内存里面找，看有没有这些数据，如果有，那么就直接使用，如果没有那么就获取它，并设置到缓存中，下一次访问的时候就可以直接从内存中获取了。
  从而节省大量的时间，当然，缓存是一种典型的空间换时间的方案。

#### 1 懒汉式-线程不安全
UnsafeLazyLoadSingleton:
- 私有静态变量 uniqueInstance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
- 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入 `if (uniqueInstance == null)` ，并且此时 uniqueInstance 为 null，那么会有多个线程执行 `uniqueInstance = new Singleton();` 语句，这将导致实例化多次 uniqueInstance。

#### 2 饿汉式-线程安全
StaticInstanceSingleton:
- 线程不安全问题主要是由于 uniqueInstance 被实例化多次，采取直接实例化 uniqueInstance 的方式就不会产生线程不安全问题。但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。

#### 3 懒汉式-线程安全
SyncLazyLoadSingleton:
- 只需要对 getInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。
- 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 uniqueInstance 已经被实例化了。这会让线程阻塞时间过长，因此该方法有性能问题

#### 4 双重校验锁-线程安全
DoubleCheckedLocking：
- uniqueInstance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行，只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
- 双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。

uniqueInstance 采用 volatile 关键字修饰也是很有必要的， `uniqueInstance = new Singleton();` 这段代码其实是分为三步执行：

1. 为 uniqueInstance 分配内存空间
2. 初始化 uniqueInstance
3. 将 uniqueInstance 指向分配的内存地址

但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1>3>2。指令重排在单线程环境下不会出现问题，但是在多线程环境下会**导致一个线程获得还没有初始化的实例**。
例如，线程 T<sub>1</sub> 执行了 1 和 3，此时 T<sub>2</sub> 调用 getUniqueInstance() 后发现 uniqueInstance 不为空，因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。

使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。

#### 5 静态内部类实现
InnerClassSingleton：
- 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。只有当调用 `getInstance()` 方法从而触发 `SingletonHolder.INSTANCE` 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
- 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。

#### 6 枚举实现
SingletonEnum：

### 设计原则
NA

### JDK

- [java.lang.Runtime#getRuntime()](http://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime%28%29)
- [java.awt.Desktop#getDesktop()](http://docs.oracle.com/javase/8/docs/api/java/awt/Desktop.html#getDesktop--)
- [java.lang.System#getSecurityManager()](http://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getSecurityManager--)
