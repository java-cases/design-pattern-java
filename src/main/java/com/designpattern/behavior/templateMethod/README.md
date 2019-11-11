## 模板方法（Template Method）

### Intent

定义一个操作中算法的框架，而将一些步骤延迟到子类中。
使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

### Class Diagram


### Implementation

冲咖啡和冲茶都有类似的流程，但是某些步骤会有点不一样，要求复用那些相同步骤的代码。

### JDK

- java.util.Collections#sort()
- java.io.InputStream#skip()
- java.io.InputStream#read()
- java.util.AbstractList#indexOf()