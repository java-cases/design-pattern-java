## 解释器（Interpreter）

### Intent

给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

### Class Diagram

- ValueNode：终结符表达式，包含数字。
- OperatorNode：操作符表达式，包含计算逻辑。
- Context：上下文，包含解释器之外的一些全局信息。

### Implementation

以下是一个计算器实现，具有 +、-、*、/、min、max等 规则，通过规则可以构建一颗计算规则树，用来计算一个文本的值。

例如计算 4 - ( 3 * ( 1 + 2 ) )文本的值。

### JDK

- [java.util.Pattern](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
- [java.text.Normalizer](http://docs.oracle.com/javase/8/docs/api/java/text/Normalizer.html)
- All subclasses of [java.text.Format](http://docs.oracle.com/javase/8/docs/api/java/text/Format.html)
- [javax.el.ELResolver](http://docs.oracle.com/javaee/7/api/javax/el/ELResolver.html)