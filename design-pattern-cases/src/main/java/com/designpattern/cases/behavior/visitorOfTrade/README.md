## 访问者（Visitor）

### Intent

表示一个作用于某对象结构中的各个元素的操作。

访问者模式可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

### Class Diagram

- Visitor：访问者，为每一个 ConcreteElement 声明一个 visit 操作。
- ConcreteVisitor：具体访问者，存储遍历过程中的累计结果。
- ObjectStructure：对象结构，可以是组合结构，或者是一个集合。

### Implementation

### JDK

- javax.lang.model.element.Element and javax.lang.model.element.ElementVisitor
- javax.lang.model.type.TypeMirror and javax.lang.model.type.TypeVisitor