## 组合（Composite）

### Intent

组合多个对象形成树形结构，以表示具有部分-整体关系的层次结构。组合模式让客户端可以统一对待单个对象和组合对象。

### Class Diagram

- Leaf：叶子节点对象，定义和实现叶子对象的行为，不再包含其它的子节点对象。
- Composite：组合对象，通常会存储子组件，定义包含子组件的那些组件的行为，并实现在组件接口中定义的与子组件有关的操作。
- 组件（Component）类是组合类（Composite）和叶子类（Leaf）的父类，可以把组合类看成是树的中间节点。

组合对象拥有一个或者多个组件对象，因此组合对象的操作可以委托给组件对象去处理，而组件对象可以是另一个组合对象或者叶子对象。

### Implementation

商品类别树的管理，比如有如下所示的商品类别树：
- 服装
    - 男装
        - 衬衣
        - 夹克
    - 女装
        - 裙子
        - 套装

- 根节点，比如服装，它没有父节点，它可以包含其它的节点
- 树枝节点，有一类节点可以包含其它的节点，称之为树枝节点，比如男装、女装
- 叶子节点，有一类节点没有子节点，称之为叶子节点，比如衬衣、夹克、裙子、套装

### JDK

- javax.swing.JComponent#add(Component)
- java.awt.Container#add(Component)
- java.util.Map#putAll(Map)
- java.util.List#addAll(Collection)
- java.util.Set#addAll(Collection)