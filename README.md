# Scala 学习

本项目由 `Jetbarin` 的 `Maven` 进行配置

## 语法捡漏：

### identifier 标识符命名

- 标识符命名如涉及到 `scala` 关键字，则用反引号 `` 即可
- 特殊符号组合可作为变量名
```scala
object varAndVal {
  def main(args: Array[String]): Unit = {
    
    val `class` = "class"
    val +-*/% = "加减乘除百分号"
  }
}
```

### 包对象

- 包对象就是在文件夹里，和文件夹同名的`package`称为包对象，作为对应包下的所有scala和object，可以直接访问
- scala的包对象在嵌套风格的包中是不可以直接访问的，须像传统的文件夹的包才可以在同一包的任意位置访问
- intelliJ里直接右键 `New - Package Object`即可创建
- scala里的导包：
```scala
// 通配符
import java.util._
// 别名
import java.util.{ArrayList => jl}
// 多个导入
import java.util.{HashSet, ArrayList}
// 屏蔽包
import java.util.{ArrayList => _,_ }
// 绝对路径导入
new _root_.java.util.HashMap
```
