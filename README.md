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

